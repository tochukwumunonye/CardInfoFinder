package com.tochukwu.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.tochukwu.data.remote.response.Bank
import com.tochukwu.data.remote.response.Country
import com.tochukwu.data.utils.Constants.CARD_INFO_TABLE_NAME

/**
 * Created by Mayokun Adeniyi on 22/07/2020.
 */

@Entity(tableName = CARD_INFO_TABLE_NAME)
data class CardInfoEntity(

    @PrimaryKey
    @ColumnInfo(name = "unique_id")
    val id: Int? = 0,
    val bank: Bank?,
    val brand: String? = "",
    val country: Country?,
    val type: String? = ""
)
