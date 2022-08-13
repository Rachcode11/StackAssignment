package com.Betty;

import com.Exercise.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountTest {

    @Test
    public void createAccount(){
        Account account = new Account();
        assertNotNull(account);
        assertEquals(0,account.getBalance("2325"));

    }
    @Test
    public void depositMoneyInTheAccount(){
        Account rachealAccount = new Account();
        assertEquals(0,rachealAccount.getBalance("2325"));
        rachealAccount.getDeposit(3000);
        assertEquals(3000,rachealAccount.getBalance("2325"));
    }
    @Test
    public void WithdrawMoneyInTheAccount(){
        Account rachealAccount = new Account();
        assertEquals(0,rachealAccount.getBalance("2325"));
        rachealAccount.getDeposit(3000);
        rachealAccount.getWithdraw(5000,"2325");
        assertEquals(3000,rachealAccount.getBalance("2325"));
    }

}
