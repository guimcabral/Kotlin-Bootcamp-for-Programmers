/* Funções de prática

    Nesta prática, você criará seu próprio arquivo Kotlin com uma função principal e uma outra função. Você usará esse arquivo em práticas posteriores como um arquivo de rascunho para o seu código, como fazemos nos screencasts.

    Tarefas básicas
        1. Crie um novo arquivo Kotlin.
        2. Copie e cole a função main() de Hello World para o arquivo.
        3. Crie uma nova função dayOfWeek().
        4. No corpo da função, imprima "What day is it today?"
        5. Acione dayOfWeek() a partir de main().
        6. Execute o programa.

    Tarefa estendida
        No corpo da função dayOfWeek (), responda à pergunta imprimindo que dia da semana estamos.
        
        Dicas
        - Você pode usar bibliotecas Java (java.util) do Kotlin. Por exemplo, para obter o dia da semana:

            Calendar.getInstance().get(Calendar.DAY_OF_WEEK) 

        - Para importar a biblioteca, digite o código e pressione Option + Enter no Mac, ou Alt + Enter no Windows, sobre a classe vermelha Calendar.
        - A depender do dia da semana, use uma instrução when para imprimir uma string, O primeiro dia da semana é domingo. */


import java.util.*

fun main() {
    dayOfWeek()
}

fun dayOfWeek(){
    println("What day is it today?")
    println(
        when(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)){
            1 -> "Sunday"
            2 -> "Monday"
            3 -> "Tuesday"
            4 -> "Wednesday"
            5 -> "Thursday"
            6 -> "Friday"
            7 -> "Saturday"
            else -> "Error"
    })
}