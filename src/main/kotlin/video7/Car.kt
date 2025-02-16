package video7

// Primary Constructor
class Car(val brand: String, val color: String) {

//    val brand: String
//    val color: String
//
//    constructor(brand: String, color: String) {
//        this.brand = brand
//        this.color = color
//    }

    fun showInformation() {
        println("$brand, $color")
    }

    override fun toString(): String {
        return "$brand, $color"
    }
}