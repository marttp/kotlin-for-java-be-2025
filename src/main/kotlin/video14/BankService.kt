package video14

import java.math.BigDecimal

interface BankService {

    suspend fun deposit(id: Int, amount: BigDecimal)

    suspend fun withdraw(id: Int, amount: BigDecimal): BigDecimal
}