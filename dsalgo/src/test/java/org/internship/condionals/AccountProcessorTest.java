package org.internship.condionals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountProcessorTest {

    private final AccountProcessor processor = new AccountProcessor();

    @Test
    void testSavings() {
        AccountProcessor.BankAccount acc = new AccountProcessor.BankAccount(101, "Savings");
        assertEquals("Processing savings for: 101", processor.processAccount(acc));
    }

    @Test
    void testCurrent() {
        AccountProcessor.BankAccount acc = new AccountProcessor.BankAccount(202, "Current");
        assertEquals("Processing current account: 202", processor.processAccount(acc));
    }

    @Test
    void testNullAccount() {
        assertEquals("Account is null", processor.processAccount(null));
    }

    @Test
    void testUnknownObject() {
        assertEquals("Unknown account type", processor.processAccount("Not an account"));
    }
}