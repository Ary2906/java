package org.internship.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumFirstNNumbersTest {

    @Test
    void testSumFirstNNumbers() {
        SumFirstNNumbers sumFirstNNumbers = new SumFirstNNumbers();
        assertEquals(55, sumFirstNNumbers.sumFirstNNumbers(10), "Sum of first 10 numbers should be 55");
    }

    @Test
    void testSumFirstNNumbersWithNegativeInput() {
        SumFirstNNumbers sumFirstNNumbers = new SumFirstNNumbers();
        assertEquals(0, sumFirstNNumbers.sumFirstNNumbers(-10), "Sum of first -10 numbers should be 0");
    }
}
