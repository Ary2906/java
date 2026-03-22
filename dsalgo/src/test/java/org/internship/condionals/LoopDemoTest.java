package org.internship.condionals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LoopDemoTest {

    @Test
    void testLoopLogic() {
        LoopDemo loopDemo = new LoopDemo();
        assertEquals("aaa", loopDemo.getRepeatMessage("a", 3), "a should be rpeated 3 times");
    }
}