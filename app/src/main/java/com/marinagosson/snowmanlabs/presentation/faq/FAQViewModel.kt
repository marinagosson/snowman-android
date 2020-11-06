package com.marinagosson.snowmanlabs.presentation.faq

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.marinagosson.snowmanlabs.domain.core.FAQUseCase

class FAQViewModel (private val context: Application,
                    private val useCase: FAQUseCase
) : AndroidViewModel(context) {
}