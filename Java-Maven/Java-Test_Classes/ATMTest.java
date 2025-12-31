import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class ATMTest {
    @Test
    void TestCase1 () {
        AmountWithdraw a1 = new AmountWithdraw(5000);
        a1.withdraw(1000);
        Assertions.assertNotEquals(400, a1.balance, "In Correct");
    }@Test
    void TestCase2 () {
        AmountWithdraw a1 = new AmountWithdraw(5000);
        a1.withdraw(1000);
        Assertions.assertEquals(4000, a1.balance, "In Correct");
    }
    @Test
    void TestCase3 () {
        AmountWithdraw a1 = new AmountWithdraw(5000);
        a1.withdraw(1000);
        Assertions.assertFalse(400==a1.balance, "Correct");
    }
    @Test
    void TestCase4 () {
        AmountWithdraw a1 = new AmountWithdraw(5000);
        a1.withdraw(1000);
        Assertions.assertTrue(4000==a1.balance, "Correct");
    }
    @Test
    void TestCase5 () {
        AmountWithdraw a1 = null;
        Assertions.assertNull(a1);
    }
    @Test
    void TestCase6 () {
        AmountWithdraw a1 = new AmountWithdraw(5000);
        Assertions.assertNotNull(a1);
    }

    @Test
    void TestInSufficientBalance() {
        AmountWithdraw a1 = new AmountWithdraw(50);
        Assertions.assertThrows(ArithmeticException.class, () -> a1.withdraw(100));
    }
    @Test
    void TestNegative() {
        AmountWithdraw a1 = new AmountWithdraw(100);
        Assertions.assertThrows(ArithmeticException.class,() -> a1.withdraw(-100) );
    }
    @Test
    void ZeroBalance() {
        AmountWithdraw a1 = new AmountWithdraw(1000);
        a1.withdraw(1000);
        Assertions.assertEquals(0, a1.balance, " Zero Balance Left");
    }
}
