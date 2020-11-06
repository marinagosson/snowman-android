package com.marinagosson.snowmanlabs.faq.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.marinagosson.snowmanlabs.faq.domain.core.FAQUseCase

class FAQViewModel (private val context: Application,
                    private val useCase: FAQUseCase) : AndroidViewModel(context) {
}