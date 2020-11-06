package com.marinagosson.snowmanlabs.presentation.faq

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marinagosson.snowmanlabs.R
import org.koin.android.architecture.ext.viewModel

class FAQActivity : AppCompatActivity() {

//    private lateinit var activityFAQBinding: ActivityFAQBinding
    private val faqViewModel: FAQViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faq)
    }

    companion object {
        private val TAG = FAQActivity::class.java.name
    }
}