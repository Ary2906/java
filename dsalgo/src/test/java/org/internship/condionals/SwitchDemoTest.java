package org.internship.condionals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SwitchDemoTest {

    @Test
    void testSwitchLogic() {
        SwitchDemo demo = new SwitchDemo();
        assertEquals("Weekday", demo.getDayType(3));
        assertEquals("Weekend", demo.getDayType(6));
        assertEquals("Invalid Day", demo.getDayType(99));
    }
}