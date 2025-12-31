import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @BeforeEach
    void Print() {
        int i = 1;
        System.out.println("Test cases"+i);
        i++;
    }
    @Test
    void testAdd() {
        assertEquals(15, calc.add(10, 5));
    }

    @Test
    void testSub() {
        assertEquals(5, calc.subtract(10, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(50, calc.multiply(10, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2, calc.divide(10, 5));
    }
    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
    }
}
