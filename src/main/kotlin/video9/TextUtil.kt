package video9

object TextUtil {

    fun checkVowelExisting(text: String): Boolean {
        for (c in text) {
            when (c) {
                'a', 'e', 'i', 'o', 'u' -> return true
            }
        }
        return false
    }
}