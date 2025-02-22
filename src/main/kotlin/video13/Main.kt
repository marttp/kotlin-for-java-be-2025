package video13

import java.math.BigDecimal

fun main() {
    val accountMap = hashMapOf(
        1 to BigDecimal("1000")
    )
    val bankService = BankService(accountMap)
    bankService.deposit(1, BigDecimal("2000"))
    val balance = bankService.withdraw(1, BigDecimal("500"))
    println(accountMap)
    println("Balance: $balance")
}