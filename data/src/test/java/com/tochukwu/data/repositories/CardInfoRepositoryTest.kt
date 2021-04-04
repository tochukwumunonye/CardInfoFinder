package com.tochukwu.data.repositories

import com.tochukwu.data.local.dao.CardInfoDao
import com.tochukwu.data.remote.api.CardInfoApiService
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner
import org.mockito.Mockito.*
import retrofit2.Response

/**
 * Created by Mayokun Adeniyi on 24/07/2020.
 */
@RunWith(MockitoJUnitRunner::class)
@ExperimentalCoroutinesApi
class CardInfoRepositoryTest {

    //region constants

    //endregion constants

    //region helper fields
    @Mock
    private lateinit var cardInfoApiService: CardInfoApiService

    @Mock
    private lateinit var cardInfoDao: CardInfoDao
    //endregion helper fields

    private lateinit var systemUnderTest: CardInfoRepositoryImpl

    @Before
    fun setUp() {
        systemUnderTest = CardInfoRepositoryImpl(cardInfoApiService, cardInfoDao)

    }

    @Test
    fun getCardInfo_fromRemote_returnSuccessCardInfo() = runBlockingTest {
        `when`(cardInfoApiService.getCardInfo(CARD_NUMBER)).thenReturn(
            Response.success(
                successCardInfoResponse
            )
        )
        systemUnderTest.getCardInfo(CARD_NUMBER, true)

        verify(cardInfoApiService, times(1)).getCardInfo(CARD_NUMBER)
        verify(cardInfoDao, times(1)).saveCardInfo(fakeCardInfoEntity)
    }

    @Test
    fun getCardInfo_fromLocal_returnCachedCardInfo_success() = runBlockingTest {
        `when`(cardInfoDao.getCardInfo(CARD_NUMBER)).thenReturn(fakeCardInfoEntity)

        systemUnderTest.getCardInfo(CARD_NUMBER,false)

        verifyNoMoreInteractions(cardInfoApiService)
        verify(cardInfoDao, times(1)).getCardInfo(CARD_NUMBER)
    }


    // region helper methods

    // endregion helper methods

    // region helper classes

    // endregion helper classes

}