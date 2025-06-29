import org.junit.Test;
import static org.junit.Assert.*;

public class NumberCheckerTest {

    @Test
    public void testPositive() {
        NumberChecker checker = new NumberChecker();
        assertEquals("Positive", checker.checkNumber(5));
    }

    @Test
    public void testNegative() {
        NumberChecker checker = new NumberChecker();
        assertEquals("Negative", checker.checkNumber(-3));
    }

    @Test
    public void testZero() {
        NumberChecker checker = new NumberChecker();
        assertEquals("Zero", checker.checkNumber(0));
    }
}