package com.tochukwu.data.local

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import com.tochukwu.data.local.entities.CardInfoEntity
import com.tochukwu.data.remote.response.Bank
import com.tochukwu.data.remote.response.Country
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.notNullValue
import org.junit.*
import org.junit.Assert.assertThat
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
@ExperimentalCoroutinesApi
@SmallTest
class CardInfoDaoTest {

    // region helper fields

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var database: CardInfoDatabase

    //endregion helper fields

    @Before
    fun setUp() {
        database = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            CardInfoDatabase::class.java
        ).allowMainThreadQueries().build()
    }

    @After
    fun tearDown() {
        database.close()
    }

    @Test
    fun insertCardInfo_getTaskInfo_returnSame() = runBlockingTest {
        val cardInfoEntity = CardInfoEntity(
            id = CARD_NUMBER,
            bank = Bank(name = "Access"),
            brand = "Brand",
            type = "Type",
            country = Country(name = "Nigeria")
        )
        database.cardInfoDao.saveCardInfo(cardInfoEntity)

        val returnedCardInfo = database.cardInfoDao.getCardInfo(CARD_NUMBER)

        assertThat<CardInfoEntity>(returnedCardInfo as CardInfoEntity,notNullValue())
        assertThat(returnedCardInfo.type, `is`(cardInfoEntity.type))
        assertThat(returnedCardInfo.country, `is`(cardInfoEntity.country))
        assertThat(returnedCardInfo.bank, `is`(cardInfoEntity.bank))
        assertThat(returnedCardInfo.brand, `is`(cardInfoEntity.brand))
    }
}