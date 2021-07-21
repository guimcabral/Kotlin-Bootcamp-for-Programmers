/* Hora de praticarmos: operações básicas

	Resolva o problema abaixo usando os métodos do operador, em uma linha de código.

	Se você começar com 2 peixes e eles se reproduzirem duas vezes, produzindo 71 filhotes na primeira vez, e 233 na segunda. 13 peixes são engolidos por uma moreia faminta. Quantos peixes sobraram? Quantos aquários são necessários se cada um comportar 30 peixes?

	    Dica: Você pode encadear acionamentos de método.
	    Dica: Você pode acionar os métodos em números, e o Kotlin irá convertê-los em objetos.
	    Pergunta bônus: O que há de especial nos números de peixes?	*/

	/* Minha resposta */
		val num_fish: Int = 2 + 71 + 233 - 13
		val num_aquarium: Int = num_fish/30 + 1

	/* Resposta da Udacity */
		2.plus(71).plus(233).minus(13).div(30).plus(1)


/* Hora de praticarmos: variáveis

    1. Crie uma variável String rainbowColor, defina seu valor de cor e altere-a.
    2. Crie uma variável blackColor cujo valor não possa ser alterado depois de atribuído. Mesmo assim, tente alterar. */

    /* Minha resposta */
	    var rainbowColor: String = "red"
	    rainbowColor = "blue"

	    val  blackColor: String = "black"
	    blackColor = "white"

	/* Resposta da Udacity */
		var rainbowColor = "red"
		rainbowColor = "blue"

		val blackColor = "black"
		blackColor = "white" 		// Error


/* Hora de praticarmos: anulabilidade

    Tente definir rainbowColor para null. Declare duas variáveis, greenColor e blueColor. Use duas formas diferentes de defini-las para null. */

    /* Minha resposta */
	    rainbowColor = null			// Error

	    var greenColor = null
	    var blueColor: String? = null

	/* Resposta da Udacity */
		var greenColor = null
		var blueColor: Int? = null


/* Hora de praticarmos: anulabilidade/listas

    1. Crie uma lista com dois elementos que sejam nulos, e faça isso de duas maneiras diferentes.
    2. Agora, crie uma lista em que a lista seja nula. */

    /* Minha resposta */
	    var list1 = listOf(null, null)
	    var list2: List<String?> = listOf(null, null)

	    var list3: List<String?>? = null

	/* Resposta da Udacity */
		listOf(null,null)
		[null, null]			// Não consegui fazer isso funcionar
		var list: List<Int?> = listOf(null, null)

		var list2:List<Int>? = null


/* Hora de praticarmos: checagem de nulos

    Crie uma variável inteira anulável chamada nullTest, e defina-a como null. Use uma verificação nula que aumente o valor em um se não for nulo. E, caso contrário, retorne 0 e imprima o resultado.

	Dica: Use o operador Elvis. */

	/* Minha resposta */
	    var nullTest: Int? = null
	    print(nullTest?.plus(1) ?: 0)

	/* Resposta da Udacity */
		println(nullTest2?.inc() ?:0)