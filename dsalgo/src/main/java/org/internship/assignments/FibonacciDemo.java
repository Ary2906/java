package org.internship.assignments;

import java.util.ArrayList;
import java.util.List;

public class FibonacciDemo {

    public List<Integer> getFibonacciSeries(int n) {
        List<Integer> series = new ArrayList<>();

        if (n < 0) return series;

        series.add(0);
        if (n == 0) return series;

        series.add(1);
        if (n == 1) return series;

        for (int i = 2; i < n; i++) {
            int nextNumber = series.get(i - 1) + series.get(i - 2);
            series.add(nextNumber);
        }

        return series;
    }
}