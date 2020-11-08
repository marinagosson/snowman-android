package com.marinagosson.snowmanlabs

import android.app.Application
import android.util.Log
import com.facebook.stetho.Stetho
import com.marinagosson.snowmanlabs.data.dynamic.DatabaseHelper
import com.marinagosson.snowmanlabs.di.dataModule
import com.marinagosson.snowmanlabs.di.uiModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin


class AppAplication  : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidLogger()
            androidContext(this@AppAplication)
            modules(listOf(dataModule, uiModule))
        }
        Stetho.initializeWithDefaults(this);

    }

}