package com.marinagosson.snowmanlabs.domain.core

import com.marinagosson.snowmanlabs.data.model.ErrorModel

interface UseCaseResponse<T> {

    fun onSuccess(result: T)

    fun onError(errorModel: ErrorModel?)
}