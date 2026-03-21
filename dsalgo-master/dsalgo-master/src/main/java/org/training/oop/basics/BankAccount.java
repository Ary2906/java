package org.training.oop.basics;

public class BankAccount {
    private String accountHolder;
    private double balance; // Encapsulation: Private field

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        // Validation logic inside constructor
        this.balance = Math.max(0, initialBalance);
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
