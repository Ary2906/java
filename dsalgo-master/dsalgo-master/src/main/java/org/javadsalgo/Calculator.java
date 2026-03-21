package org.javadsalgo;

public class Calculator {
    public Calculator() {
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public int subtract(int a, int b) {
        return a-b;
    }

    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public String toString() {
        return "Calculator{}";
    }

}
