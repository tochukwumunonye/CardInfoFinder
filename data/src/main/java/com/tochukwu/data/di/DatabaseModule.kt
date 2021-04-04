package com.tochukwu.data.di

import androidx.room.Room
import com.tochukwu.data.utils.Constants.CARD_INFO_DB
import com.tochukwu.data.local.CardInfoDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module



val databaseModule = module {
    single {
        Room.databaseBuilder(androidContext(), CardInfoDatabase::class.java, CARD_INFO_DB)
            .fallbackToDestructiveMigration().build()
    }

    factory { get<CardInfoDatabase>().cardInfoDao }
}