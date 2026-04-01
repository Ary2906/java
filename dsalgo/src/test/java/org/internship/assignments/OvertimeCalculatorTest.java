package org.internship.assignments;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OvertimeCalculatorTest {

    OvertimeCalculator calculator = new OvertimeCalculator();

    @Test
    void testStandardDay() {
        // [9, 17, 30, 1.5] -> 8 hours * 30 = $240.00
        double[] log = {9, 17, 30, 1.5};
        assertEquals("$240.00", calculator.overTime(log));
    }

    @Test
    void testOvertimeDay() {
        // [16, 18, 30, 1.8] -> 1hr regular (30) + 1hr overtime (30 * 1.8 = 54) = $84.00
        double[] log = {16, 18, 30, 1.8};
        assertEquals("$84.00", calculator.overTime(log));
    }

    @Test
    void testDecimalHours() {
        // [13.25, 15, 30, 1.5] -> 1.75 hours * 30 = $52.50
        double[] log = {13.25, 15, 30, 1.5};
        assertEquals("$52.50", calculator.overTime(log));
    }

    @Test
    void testOnlyOvertime() {
        // [18, 20, 30, 2.0] -> 2 hours overtime * (30 * 2.0) = $120.00
        double[] log = {18, 20, 30, 2.0};
        assertEquals("$120.00", calculator.overTime(log));
    }
}