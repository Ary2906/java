package org.training.oop.poly;

public class Printer {
    // Compile-time Polymorphism (Overloading)
    public String format(int value) { return "Int: " + value; }
    public String format(String value) { return "String: " + value; }
}
