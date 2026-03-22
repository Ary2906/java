package org.javadsalgo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SyntaxBasicsTest {
    @Test
    void testBMI() {
        SyntaxBasics sb = new SyntaxBasics();
        assertEquals(22.85, sb.calculateBMI(70, 1.75), 0.01); // 0.01 is delta for double precision
    }

    @Test
    void testAgeCheck() {
        SyntaxBasics sb = new SyntaxBasics();
        assertTrue(sb.isAdult(21));
        assertFalse(sb.isAdult(16));
    }
}
