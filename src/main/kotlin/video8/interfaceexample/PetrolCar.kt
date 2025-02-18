package video8.interfaceexample

class PetrolCar(override var color: String, override var speed: Int) : Car() {

    override fun speedUp(speed: Int) {
        this.speed = this.speed.plus(speed)
    }

    override fun speedDown(speed: Int) {
        this.speed = this.speed.minus(speed)
    }

    override fun turnLeft() {
        println("turnLeft - Petrol Car")
    }

    override fun turnRight() {
        println("turnRight - Petrol Car")
    }
}