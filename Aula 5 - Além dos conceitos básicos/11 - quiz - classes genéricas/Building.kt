// A solução da Udacity declara a classe como:
// class Building<T: BaseBuildingMaterial>(val material: T)
class Building(val material: BaseBuildingMaterial) {
    val baseMaterialsNeeded: Int = 100
    val actualMaterialsNeeded: Int = material.numberNeeded * baseMaterialsNeeded

    fun build() {
        println("$actualMaterialsNeeded of ${material::class.simpleName} needed")
    }
}