import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Exercise 3: Assertions in JUnit
 *
 * This class demonstrates the usage of different JUnit assertions
 * to validate expected outcomes in unit testing.
 */
public class AssertionsTest {

    @Test
    public void testAssertions() {

        // Checking if two values are equal
        int result = 2 + 3;
        assertEquals(5, result, "2 + 3 should equal 5");

        // Checking a true condition
        int a = 10;
        int b = 5;
        assertTrue(a > b, "a should be greater than b");

        // Checking a false condition
        assertFalse(a < b, "a should not be less than b");

        // Checking null value
        String nullValue = null;
        assertNull(nullValue, "Value should be null");

        // Checking non-null value
        Object obj = new Object();
        assertNotNull(obj, "Object should not be null");
    }
}