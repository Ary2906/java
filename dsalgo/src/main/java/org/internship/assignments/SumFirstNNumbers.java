package org.internship.assignments;

public class SumFirstNNumbers {
    public int sumFirstNNumbers(int n) {
        if (n < 1)
            return 0;
        return (n * (n + 1)) / 2;
    }
}
