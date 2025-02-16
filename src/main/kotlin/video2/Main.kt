package video2

const val LIMIT = 50L

fun main() {
    // Data Type => All of them is class
    // var => Mutable/Reassign
    // val => Immutable/Cannot Reassign
    var numMutable: Int = 5
    // var numMutable = 5
    println("numMutable: $numMutable")
    numMutable = 2
    println("numMutable: $numMutable")

    val numImmutable: Int = 10
    println("numImmutable: $numImmutable")
//    numImmutable = 2 // Error
//    println("numImmutable: $numImmutable")

    println("Const: $LIMIT")

    operatorExample()
    conditionExample()
    iterationOrLoopExample()
}

fun iterationOrLoopExample() {
    println()
    println("Start Iteration Example!")
    // While - like java
    var amount = 2
    while (amount-- > 0) {
        println("Amount left: $amount")
    }
    // For/Repeat
    amount = 2
    repeat(amount) { a ->
        println("Current: $a")
    }
    println("========")
    // for (int i = 0; i < 10; i++)
    for (i in 0 until 10) {
        println(i)
    }
    println()
    // for (int i = 0; i <= 10; i++)
    for (i in 0..10) {
        println(i)
    }
    println()
    // for (int i = 10; i >= 0; i--)
    for (i in 10 downTo 0) {
        println(i)
    }
    println()
    // for (int i = 0; i < 10; i += 2)
    for (i in 0 until 10 step 2) {
        println(i)
    }
    println()
    // for (int i = 0; i < 10; i += 2)
    for (i in 0..10 step 2) {
        println(i)
    }
    println()
    // for (int i = 10; i >= 0; i -= 2)
    for (i in 10 downTo 0 step 2) {
        println(i)
    }
}

fun conditionExample() {
    println()
    println("Start Condition Example!")
    // If-else
    val scores = 73
    // when (switch-like)
    when (checkScore(scores)) {
        true -> println("Passed!")
        else -> println("Not found!")
    }
    var vowelCount = 0
    val text = "ashdioasji"
    for (char in text) {
        when (char) {
            'a', 'e', 'i', 'o', 'u' -> vowelCount++
        }
    }
    println("VowelCount: $vowelCount")
}

fun checkScore(scores: Int): Boolean {
    val result: Boolean = if (scores >= 50) {
        true
    } else if (scores < 50 && scores >= 0) {
        false
    } else {
        false
    }
    return result
}

fun operatorExample() {
    // You can do almost the same as Java
    println()
    println("Start Operator Section!")
    val sum = 5 + 5
    val sumOperator = 5.plus(5)
    println("sum: $sum")
    println("sum: $sumOperator")

    // Example of Bit level
    // 4 - 100
    // 3 - 011
    println("Example bit: ${4.or(3)}")
    println("Shift bit: ${4.shr(2)}")
}