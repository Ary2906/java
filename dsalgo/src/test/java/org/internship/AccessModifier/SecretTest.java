package org.internship.AccessModifier;

public class SecretTest {
    public static void main(String[] args) {
        Secret vault = new Secret();
        // System.out.println(vault.socialSecurityNumber); // ERROR: Private access
        System.out.println("Accessing via public method: " + vault.getMaskedSSN());
    }
}