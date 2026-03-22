package org.internship.assignments;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LcmDemoTest {


    LcmDemo demo = new LcmDemo();

    @Test
    void testLcmNineAndEighteen() {

        assertEquals(18, demo.lcm(9, 18));
    }

    @Test
    void testLcmEightAndFive() {

        assertEquals(40, demo.lcm(8, 5));
    }

    @Test
    void testLcmSeventeenAndEleven() {

        assertEquals(187, demo.lcm(17, 11));
    }

    @Test
    void testLcmWithZero() {
        //
        assertEquals(0, demo.lcm(0, 5));
    }
}