import Calculator.Operations;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

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
}
