package org.internship.assignments;

public class LcmDemo {


    public int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }


    public int lcm(int a, int b) {
        if (a == 0 || b == 0) return 0;

        // Using Math.abs to handle negative inputs correctly
        int absoluteProduct = Math.abs(a * b);
        return absoluteProduct / gcd(a, b);
    }
}