package com.marinagosson.snowmanlabs.domain.core

import com.marinagosson.snowmanlabs.data.model.FAQ
import com.marinagosson.snowmanlabs.domain.repository.FAQRepository

class FAQUseCase constructor(private val repository: FAQRepository) : UseCase<List<FAQ>, Any>(){
    override suspend fun run(params: Any?): List<FAQ> {
        return repository.getFAQ();
    }

}