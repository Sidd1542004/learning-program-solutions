import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount("Alice", 1000);
    }

    @After
    public void tearDown() {
        account = null;
    }

    @Test
    public void testDeposit() {
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        account.withdraw(300);
        assertEquals(700, account.getBalance());
    }

    @Test
    public void testWithdrawMoreThanBalance() {
        account.withdraw(2000);
        assertEquals(1000, account.getBalance());
    }

    @Test
    public void testOwnerName() {
        assertEquals("Alice", account.getOwner());
    }
}