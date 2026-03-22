package org.internship.condionals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WhileLoopDemoTest {

    @Test
    void testSumLogic() {
        WhileLoopDemo demo = new WhileLoopDemo();
        int result = demo.sumUntilLimit(5);
        assertEquals(15, result);
    }
}