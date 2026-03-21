package org.training.oop.inheritance;

public class Employee {
    protected double baseSalary = 30000;

    public double getSalary() {
        return baseSalary;
    }
}

class Developer extends Employee {
    @Override
    public double getSalary() {
        return super.getSalary() + 10000; // super keyword usage
    }
}
