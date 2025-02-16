package video4

fun main() {
    // Read User Input (Console)
    print("Please input: ")
    val input = readln()
    println("Your input: $input")
    println(input.toDouble())

    // Example
    val inputList = mutableListOf<String>()
    repeat(10) {
        val userInput = readln()
        inputList.add(userInput)
    }
    println(inputList.joinToString(","))
}