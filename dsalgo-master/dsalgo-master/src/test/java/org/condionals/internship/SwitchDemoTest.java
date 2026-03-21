package org.condionals.internship;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SwitchDemoTest {

    @Test
    void testSwitchLogic() {
        org.condionals.internship.SwitchDemo demo = new org.condionals.internship.SwitchDemo();


        assertEquals("Weekday", demo.getDayType(3));


        assertEquals("Weekend", demo.getDayType(6));


        assertEquals("Invalid Day", demo.getDayType(99));

        System.out.println("Switch test passed!");
    }
}