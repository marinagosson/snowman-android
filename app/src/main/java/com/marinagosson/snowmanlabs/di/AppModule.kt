package com.marinagosson.snowmanlabs.di

import com.marinagosson.snowmanlabs.data.dynamic.DatabaseHelper
import com.marinagosson.snowmanlabs.data.repository.FAQRepositoryImp
import com.marinagosson.snowmanlabs.domain.core.FAQUseCase
import com.marinagosson.snowmanlabs.domain.repository.FAQRepository
import com.marinagosson.snowmanlabs.presentation.faq.FAQViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val dataModule = module {

    single { DatabaseHelper.getInstance(get()) }
    single { get<DatabaseHelper>().faqDap() }
    single { createFAQUseCase(get()) }
    single { createFAQRepository() }

}

val uiModule  = module {
    viewModel { FAQViewModel(get()) }
}

fun createFAQRepository(): FAQRepository {
    return FAQRepositoryImp()
}

fun createFAQUseCase(faqRepository: FAQRepository): FAQUseCase {
    return FAQUseCase(faqRepository)
}