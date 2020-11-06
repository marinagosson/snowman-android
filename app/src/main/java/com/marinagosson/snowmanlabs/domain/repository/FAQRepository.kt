package com.marinagosson.snowmanlabs.domain.repository

import com.marinagosson.snowmanlabs.domain.models.FAQ

interface FAQRepository {

    suspend fun getFAQ(): List<FAQ>

    suspend fun saveFAQ(faq: FAQ)
}