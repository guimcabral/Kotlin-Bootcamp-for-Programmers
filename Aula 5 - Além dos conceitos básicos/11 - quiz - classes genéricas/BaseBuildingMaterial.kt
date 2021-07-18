open class BaseBuildingMaterial() {
    open val numberNeeded = 1
}

class Wood() : BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Brick() : BaseBuildingMaterial() {
    override val numberNeeded = 8
}