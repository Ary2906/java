package org.javadsalgo;

public class ControlFlow {
    public String getGrade(int score) {
        if (score >= 90) return "A";
        if (score >= 80) return "B";
        return "F";
    }

    public int sumEvens(int limit) {
        int sum = 0;
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) sum += i;
        }
        return sum;
    }
}
