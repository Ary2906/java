package org.internship.AccessModifier;

class Secret {
    private String socialSecurityNumber = "123-45-678";

    // This method is the only way to see the private data
    public String getMaskedSSN() {
        return "***-**-678";
    }
}