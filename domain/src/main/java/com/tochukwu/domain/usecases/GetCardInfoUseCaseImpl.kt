package com.tochukwu.domain.usecases

import com.tochukwu.domain.repositories.CardInfoRepository

/**
 * Created by Mayokun Adeniyi on 23/07/2020.
 */

class GetCardInfoUseCaseImpl(private val repository: CardInfoRepository) : GetCardInfoUseCase {

    override suspend operator fun invoke(param: Int, getFromRemote: Boolean) =
        repository.getCardInfo(param,getFromRemote)
}