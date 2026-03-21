package org.javadsalgo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MethodLabTest {
    @Test
    void testAreaCalculations() {
        MethodLab lab = new MethodLab();
        assertEquals(25.0, lab.calculateArea(5.0));      // Square
        assertEquals(20.0, lab.calculateArea(4.0, 5.0)); // Rectangle
    }
}
