fun main(){
    val book = Book("Como arruinar o seu semestre", "Guilherme Cabral", 2021)

    // Também server para Triple
    val titleAndAuthor = book.getTitleAndAuthor()
    println("Aqui está o livro ${titleAndAuthor.first}, escrito por ${titleAndAuthor.second}")

    // Também serve para Pair
    val (name, author, year) = book.getTitleAuthorAndYear()
    println("Aqui está o livro $name, escrito por $author em $year")
}