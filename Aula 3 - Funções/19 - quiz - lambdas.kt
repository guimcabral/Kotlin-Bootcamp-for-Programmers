/* Hora de praticarmos: 

    Lambdas
        1. Crie um lambda e atribua-o a rollDice, que retorna um lançamento de dado (número entre 1 e 12).
        2. Estenda o lambda para fazer um argumento indicando o número de lados dos dados usados para o teste.
        3. Se você não tiver feito isso ainda, corrija o lambda para retornar 0 se o número de lados transmitidos for 0.
        4. Crie uma nova variável, rollDice2, para este mesmo lambda usando a notação de tipo de função. 

    Perguntas extras
        1. Por que você quer usar a notação de tipo de função em vez de usar apenas o lambda?
        2. Crie uma função gamePlay() que faça um teste como um argumento e imprima-o.
        3. Transmita sua função rollDice2 como um argumento para gamePlay()para gerar um lançamento de dado toda vez quegamePlay()for acionado. */


import kotlin.random.Random

fun main() {
    val rollDice = { numSides: Int ->
        if (numSides > 0)
            Random.nextInt(1, 13)
        else
            0
    }

    val rollDice2: (Int) -> Int = { numSides: Int ->
        if (numSides > 0)
            Random.nextInt(1, 13)
        else
            0
    }

    println(rollDice(0))
    println(rollDice2(1))

    // Daqui pra baixo é extra
    // Não sei responder o primeiro item do extra
    gamePlay(rollDice2(1))
}

fun gamePlay(roll: Int) {
    println(roll)
}