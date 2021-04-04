package com.tochukwu.cardinfofinder


import android.app.Application
import com.google.firebase.BuildConfig
import com.google.firebase.FirebaseApp
//import com.tochukwu.cardinfofinder.di.presentationModule
import com.tochukwu.data.di.databaseModule
import com.tochukwu.data.di.networkingModule
import com.tochukwu.data.di.repositoryModule
import com.tochukwu.domain.di.interactionModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level



class App : Application() {
    companion object {
        lateinit var instance: Application
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        FirebaseApp.initializeApp(this)
        startKoin {
            androidContext(this@App)
            if (BuildConfig.DEBUG) androidLogger(Level.DEBUG)
            modules(appModules + domainModules + dataModules)
        }
    }
}

val appModules = listOf(presentationModule)
val domainModules = listOf(interactionModule)
val dataModules = listOf(networkingModule, repositoryModule, databaseModule)