package video8.interfaceexample

abstract class Car : ChangeSpeed, Turnable {
    abstract var color: String
    abstract var speed: Int

    fun drive(speed: Int) {
        println("Drive at speed: $speed")
    }
}