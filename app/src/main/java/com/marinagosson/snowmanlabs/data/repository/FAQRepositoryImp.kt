package com.marinagosson.snowmanlabs.data.repository

import com.marinagosson.snowmanlabs.data.model.FAQ
import com.marinagosson.snowmanlabs.domain.repository.FAQRepository
import kotlinx.coroutines.delay


private const val LOADING_DELAY = 1000L

class FAQRepositoryImp : FAQRepository {

    override suspend fun getFAQ(): List<FAQ> {
        delay(LOADING_DELAY)
        return listOf(

        )
    }

    override suspend fun saveFAQ(faq: FAQ) {

    }
}