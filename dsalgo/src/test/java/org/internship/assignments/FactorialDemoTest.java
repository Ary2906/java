package org.internship.assignments;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialDemoTest {


    FactorialDemo demo = new FactorialDemo();

    @Test
    void testFactorialOfFive() {

        assertEquals(120, demo.factorial(5));
    }

    @Test
    void testFactorialOfFour() {

        assertEquals(24, demo.factorial(4));
    }

    @Test
    void testFactorialOfZero() {

        assertEquals(1, demo.factorial(0));
    }

    @Test
    void testFactorialOfOne() {
        // 1! is 1
        assertEquals(1, demo.factorial(1));
    }
}