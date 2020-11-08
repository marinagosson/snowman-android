package com.marinagosson.snowmanlabs

import android.app.Application
import com.marinagosson.snowmanlabs.di.module.FAQModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin

class AppAplication  : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidLogger()
            androidContext(this@AppAplication)
            modules(listOf(FAQModule))
        }

    }
}