package com.marinagosson.snowmanlabs

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class AppAplication  : Application() {

    private val TAG = AppAplication::class.java.simpleName

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidLogger()
            androidContext(this@AppAplication)
            androidFileProperties()
        }

    }
}