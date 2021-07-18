open class BaseBuildingMaterial() {
    open val numberNeeded = 1

    fun isSmallBuilding(building: Building) {
        println(if (building.actualMaterialsNeeded < 500) "small building" else "large building")
    }
}

class Wood() : BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Brick() : BaseBuildingMaterial() {
    override val numberNeeded = 8
}