const val BORROW_MAX = 3

class Book(val title: String, val author: String, val year: Int) {

    // É possível acessar dentro e fora da classe Book
    object Constants{
        const val BASE_URL = "www.eBooks/"
    }

    // Só é possível acessar dentro da classe Book
    companion object {
        const val BASE_URL = "www.eBooks/"
    }

    fun getTitleAndAuthor(): Pair<String, String> {
        return title to author
    }

    fun getTitleAuthorAndYear(): Triple<String,String,Int> {
        return Triple(title, author, year)
    }

    fun canBorrow(borrowed: Int): Boolean{
        return borrowed < BORROW_MAX
    }

    fun printUrl(){
        println(Constants.BASE_URL + title + ".html")
    }
}