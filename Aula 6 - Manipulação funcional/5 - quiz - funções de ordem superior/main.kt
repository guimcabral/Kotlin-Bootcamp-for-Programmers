fun main(){
    val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,0)

    fun List<Int>.divisibleBy3(){this.forEach {
        if(it%3 == 0 || it == 0)
            print("$it ")}}

    numbers.divisibleBy3()
    // 3 6 9 0 
}


// Solução da Udacity
/*
fun main(args: Array<String>) {
    val numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    print(numbers.divisibleBy {
        it.rem(3)
    })
    // [3, 6, 9, 0]
}

fun List<Int>.divisibleBy(block: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    for (item in this) {
        if (block(item) == 0) {
            result.add(item)
        }
    }
    return result
}
*/