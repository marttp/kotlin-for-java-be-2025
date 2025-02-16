package video7

fun main() {
    val carA: Car = Car("Toyota", "Silver")
    carA.showInformation()

    val postA = PostMessage(
        message = "Hello World",
        id = 1
    )
    postA.postDetail()

    println("carA: ${carA}")
    println("postA: ${postA}")
}