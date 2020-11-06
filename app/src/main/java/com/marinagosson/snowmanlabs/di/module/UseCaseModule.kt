package com.marinagosson.snowmanlabs.di.module

import com.marinagosson.snowmanlabs.domain.core.FAQUseCase
import com.marinagosson.snowmanlabs.domain.repository.FAQRepository

fun createFAQUseCase(faqRepository: FAQRepository): FAQUseCase {
    return FAQUseCase(faqRepository)
}