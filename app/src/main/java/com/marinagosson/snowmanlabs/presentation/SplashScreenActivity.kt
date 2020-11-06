package com.marinagosson.snowmanlabs.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.marinagosson.snowmanlabs.R
import com.marinagosson.snowmanlabs.presentation.faq.FAQActivity

private const val SPLASH_DELAY = 3000L

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@SplashScreenActivity, FAQActivity::class.java)
            startActivity(intent)
        }, SPLASH_DELAY)
    }
}