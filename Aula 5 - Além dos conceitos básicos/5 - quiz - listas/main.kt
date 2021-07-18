fun main() {
    val allBooks = listOf(
        Book("Romeu e Julieta", "William Shakespeare", 1592),
        Book("Hamlet", "William Shakespeare", 1599),
        Book("Otelo", "William Shakespeare", 1604)
    )

    val library = mapOf(
        allBooks[0].getTitleAndAuthor(),
        allBooks[1].getTitleAndAuthor(),
        allBooks[2].getTitleAndAuthor()
    )
    println(library)
    // {Romeu e Julieta=William Shakespeare, Hamlet=William Shakespeare, Otelo=William Shakespeare}

    println(library.any { it.key.contains("Hamlet") })
    // true
    println(library.containsKey("Hamlet"))
    // true

    val moreBooks = mutableMapOf("Como arruinar o seu semestre" to "Guilherme Cabral")
    moreBooks.getOrPut("Como consertar o seu semestre estudando pro exame") { "Guilherme Cabral" }
    println(moreBooks)
    // {Como arruinar o seu semestre=Guilherme Cabral, Como consertar o seu semestre estudando pro exame=Guilherme Cabral}
}