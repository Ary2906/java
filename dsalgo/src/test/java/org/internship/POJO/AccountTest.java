package org.internship.POJO;

import java.util.HashSet;
import java.util.Set;

public class AccountTest {
    public static void main(String[] args) {
        // Testing Constructor
        Account a1 = new Account("Alice", 500.0);
        Account a2 = new Account("Alice", 500.0);
        Account a3 = new Account("Bob", 1200.0);

        // Testing toString()
        System.out.println("Printing a1: " + a1);

        // Testing Getters/Setters
        a3.setUsername("Robert");
        System.out.println("Updated name: " + a3.getUsername());

        // Testing equals()
        // a1 and a2 have different memory addresses but identical data
        System.out.println("Is a1 logically equal to a2? " + a1.equals(a2)); // true

        // Testing hashCode() with a HashSet
        // If hashCode is implemented correctly, a1 and a2 are treated as duplicates
        Set<Account> accounts = new HashSet<>();
        accounts.add(a1);
        accounts.add(a2);

        System.out.println("Set size (should be 1 if hashCode works): " + accounts.size());
    }
}
