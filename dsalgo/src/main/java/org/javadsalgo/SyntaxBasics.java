package org.javadsalgo;

public class SyntaxBasics {
    public double calculateBMI(double weightKg, double heightMeters) {
        // Formula: weight / (height * height)
        return weightKg / (heightMeters * heightMeters);
    }

    public boolean isAdult(int age) {
        return age >= 18;
    }
}
