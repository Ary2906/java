package org.training.oop.abstraction;

public interface PaymentProcessor {
    boolean process(double amount); // Abstract contract
}

class CreditCardProcessor implements PaymentProcessor {
    @Override
    public boolean process(double amount) {
        return amount > 0 && amount < 5000; // Simulated logic
    }
}
