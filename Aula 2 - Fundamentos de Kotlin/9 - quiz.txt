/* Hora de praticarmos:

    1. Crie três variáveis String para trout,haddock e snapper.
    2. Use um modelo String para imprimir se você gosta ou não de comer esses tipos de peixe. */

    /* Minha resposta */
    	var trout: String = "trout"
    	var haddock: String = "haddock"
    	var snapper: String = "snapper"
    	println("I've never eat $trout, $haddock or $snapper.")

    /* Resposta da Udacity */
    	val trout = "trout"
		var haddock = "haddock"
		var snapper = "snapper"
		println("I like to eat $trout and $snapper, but not a big fan of $haddock.")


/* Hora de praticarmos:

    As declarações when no Kotlin são como declarações 'case' ou 'switch' em outras linguagens.

	Crie uma declaração when com três comparações:

    Se o comprimento do fishName for 0, imprima uma mensagem de erro.
    Se o comprimento estiver no intervalo entre 3 ... 12, imprima "Good fish name”
    Se for qualquer outra coisa, imprima “OK fish name”.

    /* Minha resposta */
    var fishName: String = "fish"

    when(fishName.length){
    	0 -> println("Error")
    	in 3..12 -> println("Good fish name")
    	else -> println("OK fish name")
    }

    /* Resposta da Udacity */
    when(fishName.length){
	    0 -> println("Fish name cannot be empty")
	    in 3..12 -> println("Good fish name")
	    else -> "OK fish name"
	}