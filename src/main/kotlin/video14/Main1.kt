package video14

import kotlinx.coroutines.*
import java.math.BigDecimal
import kotlin.time.measureTime

// Coroutine scope
suspend fun main(): Unit = coroutineScope {
    val accountMap = hashMapOf(
        1 to BigDecimal("1000"),
        2 to BigDecimal("1000"),
    )
    val bankService = BankServiceImpl(accountMap)
//    val elapsed1 = measureTime {
//        val depositJob = launch {
//            bankService.deposit(1, BigDecimal("2000"))
//        }
//        val withdrawJob = launch {
//            bankService.withdraw(2, BigDecimal("500"))
//        }
////        depositJob.join()
////        withdrawJob.join()
//        joinAll(depositJob, withdrawJob)
//    }
//    println("Elapsed time: $elapsed1")

    val elapsed2 = measureTime {
        val depositJob = async {
            bankService.deposit(1, BigDecimal("2000"))
        }
        val withdrawJob = async {
            bankService.withdraw(2, BigDecimal("500"))
        }
//        depositJob.await()
//        withdrawJob.await()
        awaitAll(depositJob, withdrawJob)
    }
    println("Elapsed time: $elapsed2")
}