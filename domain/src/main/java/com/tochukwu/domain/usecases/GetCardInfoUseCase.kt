package com.tochukwu.domain.usecases


import com.tochukwu.domain.models.CardInfo
import com.tochukwu.domain.utils.Result

/**
 * Created by Mayokun Adeniyi on 22/07/2020.
 */

interface GetCardInfoUseCase {
    suspend operator fun invoke(param: Int, getFromRemote: Boolean): Result<CardInfo>
}