package com.tochukwu.data.mapper

import com.tochukwu.data.local.entities.CardInfoEntity
import com.tochukwu.data.remote.response.Bank
import com.tochukwu.data.remote.response.Country
import com.tochukwu.domain.models.CardInfo

/**
 * Created by Mayokun Adeniyi on 24/07/2020.
 */

class CardInfoMapperLocal : BaseMapperRepository<CardInfoEntity, CardInfo> {
    override fun transform(type: CardInfoEntity): CardInfo = CardInfo(
        type.bank?.name ?: "", type.brand ?: "", type.country?.name ?: "", type.type ?: ""
    )

    override fun transformToRepository(type: CardInfo): CardInfoEntity = CardInfoEntity(
        bank = Bank(type.bank), brand = type.brand, country = Country(type.country)
    )
}