package org.javadsalgo;

public class StringArrayTool {
    public String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public int findMax(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) max = num;
        }
        return max;
    }
}
