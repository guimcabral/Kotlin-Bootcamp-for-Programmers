import java.awt.Color

abstract class SimpleSpice(val name: String, val spiciness: String = "mild", color: SpiceColor) :
    SpiceColor by color {

    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }

    init {
        println("Name: $name")
        println("Heat: $heat")
    }

    abstract fun prepareSpice()
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color: Color = Color.YELLOW
}

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) :
    SimpleSpice(name, spiciness, color), Grinder {

    override fun prepareSpice() {
        println("preparing")
    }

    override fun grind() {
        println("grinding")
    }
}