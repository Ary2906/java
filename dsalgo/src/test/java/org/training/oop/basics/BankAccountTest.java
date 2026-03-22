package org.training.oop.basics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    @Test
    void testDepositIncreasesBalance() {
        BankAccount account = new BankAccount("abc",100.0);
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance());
    }

    @Test
    void testNegativeInitialBalanceIsSetToZero() {
        BankAccount account = new BankAccount("xyz",-50.0);
        assertEquals(0.0, account.getBalance());
    }
}
