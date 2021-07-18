fun main() {
    val building = Building(Wood())
    building.build()
    // 400 of Wood needed

    BaseBuildingMaterial().isSmallBuilding(building)
    // small building
}