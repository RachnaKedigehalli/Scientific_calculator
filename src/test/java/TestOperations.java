import calculator.Operations;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.*;
public class TestOperations {
    private static Operations operations;
    @BeforeAll
    public static void setUp() {
        operations = new Operations();
    }
    @Test
    public void testSqRoot(){
        assertEquals(0, operations.sqRoot(0), 0);
        assertEquals(4, operations.sqRoot(16), 0);
        assertThrows(ArithmeticException.class, () -> {
            operations.sqRoot(-3);
        });
    }

    @Test
    public void testFactorial(){
        assertEquals(1, operations.factorial(0), 0);
        assertEquals(1, operations.factorial(1), 0);
        assertEquals(6, operations.factorial(3), 0);
        assertThrows(ArithmeticException.class, () -> {
            operations.factorial(-3);
        });
    }

    @Test
    public void testLog(){
        assertEquals(0, operations.log(1), 0);
        assertThrows(ArithmeticException.class, () -> {
            operations.log(0);
        });
    }
}
