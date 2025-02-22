package video14

import kotlinx.coroutines.delay
import java.math.BigDecimal

class BankServiceImpl(
    private val accountMap: HashMap<Int, BigDecimal>
): BankService {

    override suspend fun deposit(id: Int, amount: BigDecimal) {
        accountMap.putIfAbsent(id, BigDecimal.ZERO)
        println("Depositing $amount on Id: $id...")
        delay(3000)
        accountMap[id] = accountMap[id]!!.add(amount)
        println("Deposit to Id: $id completed. Balance: ${accountMap[id]!!}")
    }

    override suspend fun withdraw(id: Int, amount: BigDecimal): BigDecimal {
        if (!accountMap.containsKey(id)) {
            throw IllegalArgumentException("Account $id not registered")
        }
        if (accountMap[id]!! < amount) {
            throw IllegalArgumentException("Insufficient fund for $id")
        }
        println("Withdrawing $amount on Id: $id...")
        delay(5000)
        accountMap[id] = accountMap[id]!!.subtract(amount)
        println("Withdrawing on Id: $id completed. Balance: ${accountMap[id]!!}")
        // Return balance
        return accountMap[id]!!
    }
}