package com.tochukwu.domain.di

import com.tochukwu.domain.usecases.GetCardInfoUseCase
import com.tochukwu.domain.usecases.GetCardInfoUseCaseImpl
import org.koin.dsl.module

/**
 * Created by Mayokun Adeniyi on 23/07/2020.
 */

val interactionModule = module {
    factory<GetCardInfoUseCase> { GetCardInfoUseCaseImpl(get()) }
}