fun main() {
    val spices: List<Curry> = listOf(
        Curry("curry", "mild"),
        Curry("pepper", "medium"),
        Curry("cayenne", "spicy"),
        Curry("ginger", "mild"),
        Curry("red curry", "medium"),
        Curry("green curry", "mild"),
        Curry("red pepper", "extremely spicy")
    )

    val hotSpices = spices.filter { it.heat >= 5 }
    hotSpices[0].prepareSpice()
    hotSpices[0].grind()
    println(hotSpices[0].color)
}