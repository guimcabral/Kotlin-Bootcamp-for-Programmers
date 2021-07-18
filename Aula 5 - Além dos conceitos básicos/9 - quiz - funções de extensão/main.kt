fun main() {
    val book = Book("How to not feed your puppy", "Book", 1500, 100)
    println("Pages: ${book.pages} | Weight: ${book.weight()}")
    // Pages: 100 | Weight: 150.0

    val puppy = Puppy()
    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("Pages: ${book.pages} | Weight: ${book.weight()}")
    }
}