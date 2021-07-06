fun main() {
    val spices: List<SimpleSpice> = listOf(
        SimpleSpice("curry"),
        SimpleSpice("pepper", "medium"),
        SimpleSpice("cayenne", "spicy"),
        SimpleSpice("ginger"),
        SimpleSpice("red curry", "medium"),
        SimpleSpice("green curry", "mild"),
        SimpleSpice("red pepper", "extremely spicy")
    )

    spices.filter { it.heat >= 5 }.forEach { println(it.name) }

    makeSalt()
}