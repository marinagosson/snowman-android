package com.marinagosson.snowmanlabs.domain.core

import com.marinagosson.snowmanlabs.data.models.FAQ
import kotlinx.coroutines.delay

private const val LOADING_DELAY = 1000L

open class FAQRepository {
    suspend fun listFAQ() : List<FAQ> {
        delay(LOADING_DELAY)
        return listOf(
            FAQ(question = "Em qual data foi fundada a Snowman Labs?", anwser = "A Snowman Labs " +
                    "foi fundada no dia 9 de agosto de 2012."),
            FAQ(question = "Qual foi o primeiro cliente/ projeto que a Snow teve?", anwser = "O " +
                    "primeiro cliente que a Snow teve foi um candidato a deputado federal " +
                    "e fizemos o projeto dos santinhos digitais. Foi entregue em " +
                    "setembro de 2012."),
            FAQ(question = "Por que foi escolhido o nome Snowman Labs? ", anwser = "Por conta da " +
                    "neve em Curitiba que ocorreu em 2013. Queríamos um mascote e a partir dele, " +
                    "surgiu o nome (foi a primeira coisa que pensamos na época).")
        )
    }
}