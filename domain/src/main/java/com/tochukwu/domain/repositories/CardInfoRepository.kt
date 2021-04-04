package com.tochukwu.domain.repositories

import com.tochukwu.domain.models.CardInfo
import com.tochukwu.domain.utils.Result



interface CardInfoRepository {
    suspend fun getCardInfo(cardNumber: Int, getFromRemote: Boolean): Result<CardInfo>
}