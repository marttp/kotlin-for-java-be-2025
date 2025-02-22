package video14

import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.runBlocking
import java.math.BigDecimal
import kotlin.time.measureTime

// Blocking
fun main() {
    val accountMap = hashMapOf(
        1 to BigDecimal("1000"),
        2 to BigDecimal("1000"),
    )
    val bankService = BankServiceImpl(accountMap)
    val elapsed2 = runBlocking {
        measureTime {
            val depositJob = async {
                bankService.deposit(1, BigDecimal("2000"))
            }
            val withdrawJob = async {
                bankService.withdraw(2, BigDecimal("500"))
            }
            awaitAll(depositJob, withdrawJob)
        }
    }
    println("Elapsed time: $elapsed2")
}