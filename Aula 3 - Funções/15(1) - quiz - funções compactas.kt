/* Hora de praticarmos

	Melhore seu programa whatShouldIDoToday() com o novo conhecimento adquirido nesse segmento.
	    1. Adicione mais 3 situações e atividades. Por exemplo:
		    mood == "sad" && weather == "rainy" && temperature == 0 -> "stay in bed" 
		    temperature > 35 -> "go swimming"
	    2. Crie uma função de expressão única para cada condição e, em seguida, use-a em sua expressão when.

	Desafio
		Em vez de transmitir o mood, pegue uma string de mood do usuário.
		Dica: O operador !! pode ser útil. */


fun main(args: Array<String>) {
    println(whatShouldIDoToday("happy", "sunny"))
    println(whatShouldIDoToday("sad"))
    print("How do you feel?")
    println(whatShouldIDoToday(readLine()!!))
}

fun isVeryHot (temperature: Int) = temperature > 35

fun isSadRainyCold (mood: String, weather: String, temperature: Int) =
    mood == "sad" && weather == "rainy" && temperature == 0

fun isHappySunny (mood: String, weather: String) = mood == "happy" && weather == "sunny"

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String {
    return when {
        isVeryHot(temperature) -> "go swimming"
        isSadRainyCold(mood, weather, temperature) -> "stay in bed"
        isHappySunny(mood, weather) -> "go for a walk"
        else -> "Stay home and read."
    }
}