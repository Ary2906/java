package org.internship.operators;

public class OperatorsDemo {

    public int performArithmetic(int a, int b) {
        return (a + b) * a / b % 2;
    }

    public boolean checkLogic(int age, boolean hasLicense) {
        return (age >= 18) && hasLicense;
    }

    public int useCompound(int value) {
        value += 10;
        value *= 2;
        return value;
    }

    public String checkTernary(int score) {
        return (score >= 50) ? "Pass" : "Fail";
    }
}