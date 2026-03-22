package org.training.oop.abstraction;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentTest {
    @Test
    void testCreditCardPayment() {
        PaymentProcessor processor = new CreditCardProcessor();
        assertTrue(processor.process(100.0));
        assertFalse(processor.process(10000.0));
    }
}
