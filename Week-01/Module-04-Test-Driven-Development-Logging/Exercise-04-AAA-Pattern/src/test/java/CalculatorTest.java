import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdditionUsingAAAPattern() {

        Calculator calculator = new Calculator();
        int a = 15;
        int b = 25;

        int result = calculator.add(a, b);

        assertEquals(40, result, "Addition result should be 40");
    }
}