package video8.interfaceexample

class ElectricCar(override var color: String, override var speed: Int) : Car() {

    override fun speedUp(speed: Int) {
        this.speed = this.speed.plus(speed)
    }

    override fun speedDown(speed: Int) {
        this.speed = this.speed.minus(speed)
    }

    override fun turnLeft() {
        println("turnLeft - Electric Car")
    }

    override fun turnRight() {
        println("turnRight - Electric Car")
    }
}