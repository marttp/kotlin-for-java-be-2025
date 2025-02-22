import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import video13.BankService
import java.math.BigDecimal
import kotlin.test.assertEquals

class BankServiceTest {

    private lateinit var accountMap: HashMap<Int, BigDecimal>
    private lateinit var bankService: BankService

    @BeforeEach
    fun init() {
        // Given
        accountMap = hashMapOf(
            1 to BigDecimal("1000")
        )
        bankService = BankService(accountMap)
    }

    @Test
    fun `Deposit amount, balance on account should be increased`() {
        // When
        bankService.deposit(1, BigDecimal("100"))
        // Then
        assert(accountMap[1]!! == BigDecimal("1100")) // stdlib
        assertEquals(BigDecimal("1100"), accountMap[1]!!) // kotlin-test
        Assertions.assertEquals(BigDecimal("1100"), accountMap[1]!!) // JUnit 5
    }

    @Test
    fun `Withdraw amount, balance on account should be decreased`() {
        bankService.withdraw(1, BigDecimal("100"))
        Assertions.assertEquals(BigDecimal("900"), accountMap[1]!!)
    }

    @Test
    fun `Withdraw on non-existing account should throw IllegalArgumentException`() {
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            bankService.withdraw(2, BigDecimal("100"))
        }
    }

    @Test
    fun `Withdraw more than balance should throw IllegalArgumentException`() {
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            bankService.withdraw(1, BigDecimal("100000"))
        }
    }
}