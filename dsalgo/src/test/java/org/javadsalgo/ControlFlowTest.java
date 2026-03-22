package org.javadsalgo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ControlFlowTest {
    @Test
    void testGradingLogic() {
        ControlFlow cf = new ControlFlow();
        assertEquals("A", cf.getGrade(95));
        assertEquals("F", cf.getGrade(50));
    }

    @Test
    void testSummation() {
        ControlFlow cf = new ControlFlow();
        assertEquals(6, cf.sumEvens(5)); // 2 + 4 = 6
    }
}
