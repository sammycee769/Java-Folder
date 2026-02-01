package AccountPaackage;


import AccountPackage.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    Account pensionAccount;

    @BeforeEach
    public void startApp(){
        pensionAccount = new Account(1234);
    }

    @Test
    public void testThatDeposit5k_Gives5kBalance() {
        int balance = pensionAccount.checkBalance(1234);
        assertEquals(0,balance);
        pensionAccount.deposit(5_000);
        balance = pensionAccount.checkBalance(1234);
        assertEquals(5_000,balance);
    }
    @Test
    public void testThatDeposit5kAgain_Gives10kBalance() {
        int balance = pensionAccount.checkBalance(1234);
        assertEquals(0,balance);
        pensionAccount.deposit(5_000);
        pensionAccount.deposit(5_000);
        balance = pensionAccount.checkBalance(1234);
        assertEquals(10_000,balance);
    }
    @Test
    public void testThatNegativeDeposit5k_Gives0Balance() {
        int balance = pensionAccount.checkBalance(1234);
        assertEquals(0,balance);

        pensionAccount.deposit(5_000);
        pensionAccount.deposit(-5_000);
        balance = pensionAccount.checkBalance(1234);
        assertEquals(5000,balance);
    }
    @Test
    public void testThatDeposit5k_AndWithdraw5k_Gives5kBalance() {
        int balance = pensionAccount.checkBalance(1234);
        assertEquals(0,balance);

        pensionAccount.deposit(5_000);
        pensionAccount.withdraw(5_000,1234);
        balance = pensionAccount.checkBalance(1234);
        assertEquals(0,balance);
    }
    @Test
    public void testThatNegativeWithdraw5k_Gives5kBalance() {
        int balance = pensionAccount.checkBalance(1234);
        assertEquals(0,balance);

        pensionAccount.deposit(5_000);
        pensionAccount.withdraw(-5_000,1234);
        balance = pensionAccount.checkBalance(1234);
        assertEquals(5_000,balance);
    }
    @Test
    public void testThatWithdraw15k_WhenBalanceis5k_Gives5kBalance() {
        int balance = pensionAccount.checkBalance(1234);
        assertEquals(0,balance);

        pensionAccount.deposit(5_000);
        pensionAccount.withdraw(15_000,1234);
        balance = pensionAccount.checkBalance(1234);
        assertEquals(5_000,balance);
    }
    @Test
    public void testThatDeposit5k_AndWithdraw5k_GivesCorrectBalance() {
        int balance = pensionAccount.checkBalance(1234);
        assertEquals(0,balance);

        pensionAccount.deposit(5_000);
        pensionAccount.withdraw(5_000,1234);
        balance = pensionAccount.checkBalance(1234);
        assertEquals(0,balance);
    }
    @Test
    public void testThatCheckBalance_WithInvalidPin_DoesNothing() {
        int balance = pensionAccount.checkBalance(0000);
        assertEquals(-1,balance);
    }
    @Test
    public void testThatWithdrawalWithInvalidPin_DoesNothing() {
        int balance = pensionAccount.checkBalance(1234);
        assertEquals(0,balance);

        pensionAccount.deposit(5_000);
        int withdraw = pensionAccount.withdraw(5_000,0000);
        assertEquals(-2,withdraw);
        int balance2 = pensionAccount.checkBalance(1234);
        assertEquals(5000,balance2);
    }


}
