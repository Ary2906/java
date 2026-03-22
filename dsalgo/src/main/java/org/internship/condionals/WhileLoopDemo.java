package org.internship.condionals;


public class WhileLoopDemo{


    public int sumUntilLimit(int limit) {
        int sum = 0;
        int current = 1;


        while (current <= limit) {
            sum += current;
            current++;
        }
        return sum;
    }
}