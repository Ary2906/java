package org.internship.condionals;

public class BankingWithEnum {


    public enum AccountType { SAVINGS, CURRENT, LOAN }

    //
    public static class BankAccount {
        public int acNo;
        public AccountType type;

        public BankAccount(int acNo, AccountType type) {
            this.acNo = acNo;
            this.type = type;
        }
    }


    public String processAccount(BankAccount acc) {
        if (acc == null) {
            return "Account is null";
        }

        // Java 17 Switch Expression
        return switch (acc.type) {
            case SAVINGS -> "Processing savings for: " + acc.acNo;
            case CURRENT -> "Processing current account: " + acc.acNo;
            case LOAN    -> "Processing loan for: " + acc.acNo;
        };
    }
}