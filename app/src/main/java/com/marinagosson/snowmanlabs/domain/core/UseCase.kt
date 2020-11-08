package com.marinagosson.snowmanlabs.domain.core

import com.marinagosson.snowmanlabs.data.model.ErrorModel
import kotlinx.coroutines.*
import java.lang.Exception

abstract class UseCase<T, in Params>() where T: Any{

    abstract suspend fun  run(params: Params? = null): T

    @ExperimentalCoroutinesApi
    fun invoke(params: Params?,
    onResult: (UseCaseResponse<T>)){
        CoroutineScope(Dispatchers.Main).launch {
            try{
                val result = run(params)
                onResult?.onSuccess(result)
            } catch (e: CancellationException) {
                // TODO
                onResult.onError(ErrorModel("CancellationException"))
            } catch (e: Exception) {
                // TODO
                onResult.onError(ErrorModel("Exception"))
            }
        }
    }
}