package org.internship.condionals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.internship.condionals.BankingWithEnum.AccountType;
import org.internship.condionals.BankingWithEnum.BankAccount;

class BankingWithEnumTest {

    private final BankingWithEnum app = new BankingWithEnum();

    @Test
    void testSavingsAccount() {
        BankAccount acc = new BankAccount(501, AccountType.SAVINGS);
        assertEquals("Processing savings for: 501", app.processAccount(acc));
    }

    @Test
    void testCurrentAccount() {
        BankAccount acc = new BankAccount(502, AccountType.CURRENT);
        assertEquals("Processing current account: 502", app.processAccount(acc));
    }

    @Test
    void testLoanAccount() {
        BankAccount acc = new BankAccount(503, AccountType.LOAN);
        assertEquals("Processing loan for: 503", app.processAccount(acc));
    }

    @Test
    void testNullAccount() {
        assertEquals("Account is null", app.processAccount(null));
    }
}