package com.posomo.saltit.domain.usecase

import com.posomo.saltit.data.datastore.PosomoDataStore
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class StoreUserIdealAvgLunchPriceUseCase  @Inject constructor(
	private val posomoDataStore: PosomoDataStore,
) {

	operator fun invoke(price: Int) = flow {
		posomoDataStore.setUserIdealAvgLunchPrice(price).collect { isSuccess ->
			emit(isSuccess)
		}
	}
}