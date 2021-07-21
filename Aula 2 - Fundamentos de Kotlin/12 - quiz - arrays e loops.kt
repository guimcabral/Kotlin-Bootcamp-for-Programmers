/* Hora de praticarmos:

    Looping sobre arrays e listas é uma técnica fundamental que apresenta muita flexibilidade no Kotlin. Vamos praticar.
    Exemplo básico

        1. Crie um array integer de números chamado numbers, de 11 a 15.
        2. Crie uma lista imutável vazia para Strings.
        3. Escreva um loop for que faça um loop sobre o array e adicione a representação de string de cada número da lista.

    Exemplo de desafio

        Como você pode usar um loop for para criar (uma lista de) números entre 1 e 100 que sejam divisíveis por 7? */

    /* Minha resposta */
        val numbers = intArrayOf(11,12,13,14,15)
        val list1: MutableList<String> = mutableListOf()
        for(value in numbers){
            list1.add(value.toString())
        }
        println(list1)

        val list2: MutableList<Int> = mutableListOf()
        for(i in 1..100/7){
            list2.add(i*7)
        }
        println(list2)

    /* Resposta da Udacity */
        var list3 : MutableList<Int> = mutableListOf()
        for (i in 0..100 step 7)            // Inclui o 0, solução errada
            list3.add(i)
        print(list3)

        for (i in 0..100 step 7) println(i.toString() + " - ")