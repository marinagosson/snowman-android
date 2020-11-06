package com.marinagosson.snowmanlabs.presentation.base

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancel

abstract class BaseViewModel : ViewModel() {
    private val scope = CoroutineScope(
        Job() + Dispatchers.Main
    )

    override fun onCleared() {
        super.onCleared()
        scope.cancel();
    }
}