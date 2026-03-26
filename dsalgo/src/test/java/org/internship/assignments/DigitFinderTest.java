package org.internship.assignments;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DigitFinderTest {

    DigitFinder finder = new DigitFinder();

    @Test
    void testDigitsFoundEarly() {
        int[] input = {5175, 4538, 2926, 5057, 6401, 4376, 2280, 6137, 8798, 9083};
        assertEquals(5057, finder.findAllDigits(input));
    }

    @Test
    void testDigitsFoundLate() {
        int[] input = {5719, 7218, 3989, 8161, 2676, 3847, 6896, 3370, 2363, 1381};
        assertEquals(3370, finder.findAllDigits(input));
    }

    @Test
    void testMissingDigits() {
        int[] input = {4883, 3876, 7769, 9846, 9546, 9634, 9696, 2832, 6822, 6868};
        assertEquals("Missing digits!", finder.findAllDigits(input));
    }
}