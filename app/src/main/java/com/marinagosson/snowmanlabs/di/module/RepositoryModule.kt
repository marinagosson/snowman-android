package com.marinagosson.snowmanlabs.di.module

import com.marinagosson.snowmanlabs.data.repository.FAQRepositoryImp
import com.marinagosson.snowmanlabs.domain.repository.FAQRepository

fun createFAQRepository(): FAQRepository {
    return FAQRepositoryImp();
}