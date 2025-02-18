package video8.abstraction


fun main() {

    // Abstract class => Child class
    val car1 = PetrolCar(color = "red", speed = 1)
    val car2 = ElectricCar(color = "blue", speed = 2)
    // car1.turnLeft()
    // car2.turnLeft()
    // Polymorphism concept
    var carPoly: Car = PetrolCar(color = "red", speed = 2)
    carPoly.turnLeft()
    carPoly = ElectricCar(color = "blue", speed = 3)
    carPoly.turnLeft()
}


