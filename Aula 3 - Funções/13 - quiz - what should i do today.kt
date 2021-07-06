/* Hora de praticarmos

	Crie um programa que sugira uma atividade baseada em vários parâmetros.
	    1. Comece em um novo arquivo com uma função main.
	    2. A partir de main(), crie uma função whatShouldIDoToday().
	    3. Deixe a função com três parâmetros.
	        mood: um parâmetro de string obrigatório
	        weather: um parâmetro de string cujo padrão é "sunny"
	        temperature: um parâmetro Integer padronizado para 24 graus (Celsius).
	    4. Use um construtor when para retornar algumas atividades usando como base combinações de condições. Por exemplo:
		    mood == "happy" && weather == "Sunny" -> "go for a walk"
		    else -> "Stay home and read."
	    5. Copie/cole sua função finalizada no REPL e acione-a com combinações de argumentos. Por exemplo:
		    whatShouldIDoToday("sad")
		    > Stay home and read.

	Observação: Você precisará desse trabalho e desse código na próxima prática. */


fun main(){
    whatShouldIDoToday("happy", "rainy")
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24){
    println(
        when{
            mood == "happy" && weather == "Sunny" -> "Go for a walk"
            mood == "happy" && weather == "rainy" -> "Play Valorant"
            else -> "Stay home and read."
    })
}