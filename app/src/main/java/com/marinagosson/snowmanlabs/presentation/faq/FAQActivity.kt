package com.marinagosson.snowmanlabs.presentation.faq

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marinagosson.snowmanlabs.R

class FAQActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faq)
    }
    companion object {
        private val TAG = FAQActivity::class.java.name
    }
}