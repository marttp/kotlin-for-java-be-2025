package video9

import java.math.BigDecimal

class WalletService(private val baseUrl: String) {

    fun getWalletBalance(userId: Long): BigDecimal {
        val url = "$baseUrl/$WALLET_BALANCE_PATH/$userId"
        println("Calling getWalletBalance with url $url")
        return BigDecimal("1000")
    }

    companion object {
        const val WALLET_BALANCE_PATH = "wallets/users"
    }
}