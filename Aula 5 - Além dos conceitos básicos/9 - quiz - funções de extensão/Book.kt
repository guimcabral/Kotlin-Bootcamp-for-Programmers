class Book(val title: String, val author: String, val year: Int, var pages: Int)

fun Book.weight() = pages * 1.5
fun Book.tornPages(pagesDamaged: Int) = if (pages >= pagesDamaged) pages -= pagesDamaged else pages = 0