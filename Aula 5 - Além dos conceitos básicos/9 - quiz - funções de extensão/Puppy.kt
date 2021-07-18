import kotlin.random.Random

class Puppy {
    fun playWithBook(book: Book){
        book.tornPages(Random.nextInt(10))
    }
}