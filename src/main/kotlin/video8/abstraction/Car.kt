package video8.abstraction

abstract class Car {

    abstract var color: String
    abstract var speed: Int

    abstract fun speedUp(speed: Int)
    abstract fun speedDown(speed: Int)

    abstract fun turnLeft()
    abstract fun turnRight()
}