package com.tochukwu.data.repositories

import com.tochukwu.data.local.entities.CardInfoEntity
import com.tochukwu.data.remote.response.Bank
import com.tochukwu.data.remote.response.CardInfoResponse
import com.tochukwu.data.remote.response.Country

/**
 * Created by Mayokun Adeniyi on 24/07/2020.
 */

const val CARD_NUMBER = 123456
val fakeCardInfoEntity = CardInfoEntity(
    id = CARD_NUMBER,
    bank = Bank("adf"),
    type = "Type",
    brand = "Brand",
    country = Country("Country")
)
val successCardInfoResponse = CardInfoResponse(
    bank = Bank("adf"),
    type = "Type",
    brand = "Brand",
    country = Country("Country")
)