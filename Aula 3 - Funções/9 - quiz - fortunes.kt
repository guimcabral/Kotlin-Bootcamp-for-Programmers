/* Hora de praticarmos

    Use o código que você criou na última prática ou copie o código inicial abaixo.

    A função getFortune() deve estar recebendo apenas a fortuna, e não a data de aniversário,

    Altere o seu programa Fortune Cookie da seguinte maneira:
        1. Crie uma função chamada getBirthday() que receba a data de aniversário do usuário.
        2. Transmita o resultado de getBirthday() para getFortune() usando um argumento Integer, e use-o para retornar a fortuna correta.
        3. Remova a função de obter a data de aniversário de getFortune()
        4. Em vez de calcular a fortuna com base na data de aniversário, use uma declaração 'when' para atribuir algumas fortunas da seguinte maneira (ou use suas próprias condições):
            Se o dia de aniversário é 28 ou 31 ...
            Se o dia do aniversário é na primeira semana ...
            else… retorna a fortuna calculada como antes.

    Dica: Existem várias maneiras de fazer esta declaração when. Quanto você pode Kotlinizar?

    Código inicial:
        fun main(args: Array<String>) {
           var fortune: String
           for (i in 1..10) {
              fortune = getFortune(getBirthday())
              println("\nYour fortune is: $fortune")
              if (fortune.contains("Take it easy")) break;
           }
        } */


fun main(args: Array<String>) {
    var fortune: String
    for (i in 1..10) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break;
    }
}

fun getBirthday(): Int{
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortune(birthday: Int): String{
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    return when(birthday){
        28 or 31 -> fortunes[0]
        in 1..7 -> fortunes[1]
        else -> fortunes[birthday%fortunes.size]
    }
}