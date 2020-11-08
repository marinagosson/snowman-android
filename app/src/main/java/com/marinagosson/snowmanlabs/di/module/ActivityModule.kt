package com.marinagosson.snowmanlabs.di.module

import com.marinagosson.snowmanlabs.presentation.faq.FAQViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val FAQModule = module {
    viewModel { FAQViewModel(get()) }

    single { createFAQUseCase(get()) }

    single { createFAQRepository() }
}