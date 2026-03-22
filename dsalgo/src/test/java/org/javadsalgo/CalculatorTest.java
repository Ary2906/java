package org.javadsalgo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    @Test
    void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(20, calc.multiply(4, 5), "4 * 5 should be 20");
    }

    @Test
    void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.subtract(10, 5), "10 - 5 should be 5");
    }

    @Test
    void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(25, calc.add(20, 5), "20 + 5 should be 25");
    }
}