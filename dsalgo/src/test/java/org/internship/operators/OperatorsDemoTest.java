package org.internship.operators;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OperatorsDemoTest {

    private final OperatorsDemo demo = new OperatorsDemo();

    @Test
    void testPerformArithmetic() {
        int result = demo.performArithmetic(10, 5);
        // Calculation: (10+5)*10/5 % 2 = 150/5 % 2 = 30 % 2 = 0
        assertEquals(0, result);
    }

    @Test
    void testCheckLogicValid() {
        assertTrue(demo.checkLogic(20, true));
    }

    @Test
    void testCheckLogicInvalidAge() {
        assertFalse(demo.checkLogic(16, true));
    }

    @Test
    void testCheckLogicNoLicense() {
        assertFalse(demo.checkLogic(25, false));
    }

    @Test
    void testUseCompound() {
        int result = demo.useCompound(5);
        // Calculation: (5+10)*2 = 30
        assertEquals(30, result);
    }

    @Test
    void testCheckTernaryPass() {
        assertEquals("Pass", demo.checkTernary(55));
    }

    @Test
    void testCheckTernaryFail() {
        assertEquals("Fail", demo.checkTernary(40));
    }
}