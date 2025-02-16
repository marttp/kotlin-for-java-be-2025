package video7

data class PostMessage(
    val id: Long,
    val message: String
) {
    fun postDetail() {
        println("$id: $message")
    }
}
