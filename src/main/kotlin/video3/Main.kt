package video3

fun main() {

    fun splitText(text: String): List<String> {
        return text.split(" ")
    }

    var text: String = "Example text" // Cannot be null
    // text = null

    var text2: String? = "Example text 2" // Nullable
    text2 = null
    // Option 1 - Basic null check
    if (text2 != null) {
        println(splitText(text2).toString())
    }
    // Option 2 - Safe calls
    // Example of object usage -> node?.next?.next
    text2?.let {
        println(splitText(text2).toString())
    }
    // Option 3 - Unsafe calls
     println(splitText(text2!!).toString())

    // Option 4 - Elvis Operator (Default value)
    val text3 = text2 ?: ""
    println(splitText(text3).toString())

}