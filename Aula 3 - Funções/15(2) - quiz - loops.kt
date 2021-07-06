/* Hora de praticarmos

	Loops
	Essa aula apresentou os loops while e repeat Para praticar a utilização de cada um deles:
	    1. Altere o seu programa fortune cookie para usar repeat() em vez de um loop for. O que acontece com a instrução de quebra? Usando a mensagem de erro do compilador com o que aprendeu até agora, você consegue pensar no por quê?
	    2. Altere o programa fortune cookie para usar um loop while - que é a melhor opção quando você está executando um loop até que uma condição seja atingida. */


// Código modificado da resolução do quiz 9"
fun main(args: Array<String>) {
    var fortune: String = ""
    while (!fortune.contains("Take it easy")) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
    }
}

fun getBirthday(): Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortune(birthday: Int): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    return when (birthday) {
        28 or 31 -> fortunes[0]
        in 1..7 -> fortunes[1]
        else -> fortunes[birthday % fortunes.size]
    }
}