import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberCheckerTest{
    @Test
    public void testCheckSign(){
        assertEquals("Positive",NumberChecker.checkSign(5));
        assertEquals("Negative",NumberChecker.checkSign(-3));
        assertEquals("Zero",NumberChecker.checkSign(0));
    }
    @Test
    public void testCheckEvenOdd(){
        assertEquals("Even", NumberChecker.checkEvenOdd(4));
        assertEquals("Odd", NumberChecker.checkEvenOdd(7));
        assertEquals("Even", NumberChecker.checkEvenOdd(0));
    }
}
