package org.internship.POJO;

import java.util.Objects;

class Account {
    private String username;
    private double balance;

    // 1. Constructor: Initializes the object state
    public Account(String username, double balance) {
        this.username = username;
        this.balance = balance;
    }

    // 2. Getters & Setters: Controlled access to private data (Encapsulation)
    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public double getBalance() { return balance; }

    // 3. toString: Provides a human-readable string representation
    @Override
    public String toString() {
        return "Account{username='" + username + "', balance=" + balance + "}";
    }

    // 4. equals: Defines what makes two objects "the same" logically
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(account.balance, balance) == 0 &&
                Objects.equals(username, account.username);
    }

    // 5. hashCode: Returns a numeric ID for the object (Required for HashMaps/Sets)
    @Override
    public int hashCode() {
        return Objects.hash(username, balance);
    }
}