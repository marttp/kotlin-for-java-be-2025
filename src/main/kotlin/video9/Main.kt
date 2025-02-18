package video9

fun main() {

    val text = "sodihnasio"
    if (TextUtil.checkVowelExisting(text)) {
        println("Vowel exists!")
    } else {
        println("Non vowel")
    }

    val walletService = WalletService("https://wallet.internal.service")
    val balance = walletService.getWalletBalance(1L)
    println(balance)
}