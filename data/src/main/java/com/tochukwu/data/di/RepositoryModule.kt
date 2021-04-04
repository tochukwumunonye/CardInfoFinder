package com.tochukwu.data.di

import com.tochukwu.data.repositories.CardInfoRepositoryImpl
import com.tochukwu.domain.repositories.CardInfoRepository
import org.koin.dsl.module

/**
 * Created by Mayokun Adeniyi on 23/07/2020.
 */

val repositoryModule = module {
    factory<CardInfoRepository> { CardInfoRepositoryImpl(get(), get()) }
}