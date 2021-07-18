class Book(val title: String, val author: String, val year: Int) {
    fun getTitleAndAuthor(): Pair<String, String> {
        return title to author
    }

    fun getTitleAuthorAndYear(): Triple<String,String,Int> {
        return Triple(title, author, year)
    }
}