package chapter3;

import com.Exercise.AccountMe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountMeTest {
    private AccountMe accountMe;

    @BeforeEach
    public void setUp(){
        accountMe = new AccountMe();
    }
    @Test
    public void testThatAccountExists(){
        assertNotNull(accountMe);

    }

    @Test

    public void testThatAccountBalanceIsZeroByDefault(){
        assertEquals(0,accountMe.getBalance());
    }

    @Test
    public void testThatWhenWeDepositMoneyInTheAccountItIncreases(){
        accountMe.makeDeposit(3000);
        assertEquals(3000,accountMe.getBalance());
    }

    @Test
    public void testThatWeCanNotDepositNegativeAmount(){
        accountMe.makeDeposit(-1000);
        assertEquals(0,accountMe.getBalance());
    }
    @Test
    public void testThatAccountHasAPin(){
        accountMe.makeDeposit(3000);
        accountMe.setPin("2325");
        assertEquals(3000,accountMe.getBalance());
    }
    @Test
    public void testThatAccountCanWithdraw(){
        accountMe.setPin("2325");
        accountMe.makeDeposit(3000);
        accountMe.withdraw(1000,"2325");
        assertEquals(2000,accountMe.getBalance());
    }
    @Test
    public void testThatWeCanNotWithdrawNegativeAmount(){
        accountMe.makeDeposit(3000);
        accountMe.withdraw(-1000,"2325");
        assertEquals(3000,accountMe.getBalance());
    }
    @Test
    public void testThatWeCanNotWithdrawMoreThanTheAmountInTheAccount(){
        accountMe.makeDeposit(3000);
        accountMe.withdraw(4000,"2325");
        assertEquals(3000,accountMe.getBalance());
    }
    @Test
    public void testThatWeCanNotWithdrawInTheAccountIfBalanceIsZero(){
        accountMe.makeDeposit(0);
        accountMe.withdraw(3500,"2325");
        assertEquals(0,accountMe.getBalance());
    }
    @Test
    public void testThatWeCanNotWithdrawWithoutThePin(){
        accountMe.setPin("2325");
        accountMe.makeDeposit(3000);
        accountMe.withdraw(2000,"2325");
        assertEquals(1000,accountMe.getBalance());
    }
    @Test
    public void testThatWeCanNotWithdrawWithWrongPin(){
        accountMe.setPin("2325");
        accountMe.makeDeposit(3000);
        accountMe.withdraw(2000,"2023");
        assertEquals(3000,accountMe.getBalance());
    }

}
