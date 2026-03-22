package org.internship.condionals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LoopDemoTest {

    @Test
    void testLoopLogic() {
        LoopDemo obj = new LoopDemo();
        // This replaces your "Main" execution
        String result = obj.getRepeatMessage(3);
        // This checks if the code actually works
        assertEquals("Java Java Java", result);
    }
}