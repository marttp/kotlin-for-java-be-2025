package video6

fun main() {

    fun splitText(text: String): List<String> {
        return text.split("")
    }

    fun withdrawn(current: Long, amount: Long): Long {
        // Custom Exception (Handle business logic)
        if (current < 0 || amount < 0) {
            throw IllegalArgumentException("Amount must be non-negative")
        }
        if (current < amount) {
            throw IllegalArgumentException("Insufficient funds to draw")
        }
        // return remaining
        return current - amount
    }

    try {
        var text: String? = null
        println(splitText(text!!))
    } catch (e: NullPointerException) {
        println(e.message)
    } catch (e: Exception) {
        println("Unknown exception: ${e.message}")
    } finally {
        println("Close try/catch block")
    }
}