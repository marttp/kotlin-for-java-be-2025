package video13

import java.math.BigDecimal

class BankService(
    private val accountMap: HashMap<Int, BigDecimal>
) {

    fun deposit(id: Int, amount: BigDecimal) {
        accountMap.putIfAbsent(id, BigDecimal.ZERO)
        accountMap[id] = accountMap[id]!!.add(amount)
    }

    fun withdraw(id: Int, amount: BigDecimal): BigDecimal {
        if (!accountMap.containsKey(id)) {
            throw IllegalArgumentException("Account $id not registered")
        }
        if (accountMap[id]!! < amount) {
            throw IllegalArgumentException("Insufficient fund for $id")
        }
        accountMap[id] = accountMap[id]!!.subtract(amount)
        // Return balance
        return accountMap[id]!!
    }
}