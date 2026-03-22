package org.internship.condionals;

public class AccountProcessor {

    public static class BankAccount {
        public int acNo;
        public String type;

        public BankAccount(int acNo, String type) {
            this.acNo = acNo;
            this.type = type;
        }
    }

    public String processAccount(Object obj) {

        if (obj instanceof BankAccount b) {
            return switch (b.type) {
                case "Savings" -> "Processing savings for: " + b.acNo;
                case "Current" -> "Processing current account: " + b.acNo;
                default -> "Unknown account type";
            };
        } else if (obj == null) {
            return "Account is null";
        }

        return "Unknown account type";
    }
}