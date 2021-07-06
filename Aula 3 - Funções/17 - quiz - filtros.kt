/* Hora de praticarmos

    Você pode fazer o seguinte exercício de filtro no REPL.
        1. Crie uma lista de especiarias como esta:
            val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
        2. Crie um filtro que receba todos os curries e classifique-os pelo tamanho da string. -Dica: Depois de digitar o ponto (.), o IntelliJ lhe dará uma lista de funções que podem ser aplicadas.
        3. Filtre a lista de especiarias para retornar todas que comecem com 'c' e terminam com 'e'. Faça isso de duas maneiras diferentes.
        4. Pegue os três primeiros elementos da lista e retorne os que começam com 'c'.

    Nota: depois de aprender sobre as classes e mapa, você poderá fazer coisas muito mais interessantes utilizando os filtros. */


fun main() {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")
    println(spices.filter { it.contains("curry") }.sortedBy { it.length })
    println(spices.filter { it.startsWith('c') && it.endsWith('e') })
    println(spices.subList(0, 3).filter { it.startsWith('c') })     // ou spices.take(3).fil...
}