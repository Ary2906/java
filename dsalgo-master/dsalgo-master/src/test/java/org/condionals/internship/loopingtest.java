package org.condionals.internship;

import org.internship.condionals.looping;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LoopingTest {

    @Test
    void testLoopLogic() {
        looping obj = new looping();

        // This replaces your "Main" execution
        String result = obj.getRepeatMessage(3);

        // This checks if the code actually works
        assertEquals("Java Java Java", result);
        System.out.println("Test passed with result: " + result);
    }
}