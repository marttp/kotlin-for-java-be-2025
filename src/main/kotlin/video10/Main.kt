package video10

fun main() {
    val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    reverseArray(nums)
//    println(nums.contentToString())
    nums.print()

    val text = "Hello World in Kotlin"
    val splitted = text.split(" ")
    val reversed = splitted.reversed()
    reversed.print()
}

fun reverseArray(array: IntArray) {
    var left = 0
    var right = array.size - 1
    while (left <= right) {
        array.swap(left++, right--)
    }
}

// Extension function
fun IntArray.print() {
    println(this.contentToString())
}

fun List<String>.print() {
    println(this)
}

fun IntArray.swap(left: Int, right: Int) {
    val tmp = this[left]
    this[left] = this[right]
    this[right] = tmp
}