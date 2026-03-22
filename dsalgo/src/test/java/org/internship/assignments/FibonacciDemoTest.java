package org.internship.assignments;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciDemoTest {


    FibonacciDemo demo = new FibonacciDemo();

    @Test
    void testFibCountOne() {
        List<Integer> result = demo.getFibonacciSeries(1);
        assertEquals(List.of(0), result);
    }

    @Test
    void testFibCountTwo() {
        List<Integer> result = demo.getFibonacciSeries(2);
        assertEquals(List.of(0, 1), result);
    }

    @Test
    void testFibCountFive() {
        // Generates 5 numbers: 0, 1, 1, 2, 3
        List<Integer> result = demo.getFibonacciSeries(5);
        assertEquals(List.of(0, 1, 1, 2, 3), result);
    }

    @Test
    void testFibCountEight() {
        // Generates 8 numbers: 0, 1, 1, 2, 3, 5, 8, 13
        List<Integer> result = demo.getFibonacciSeries(8);
        assertEquals(List.of(0, 1, 1, 2, 3, 5, 8, 13), result);
    }

    @Test
    void testFibInvalid() {
        List<Integer> result = demo.getFibonacciSeries(-1);
        assertTrue(result.isEmpty());
    }
}