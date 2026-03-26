package org.internship.assignments;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordReverserTest {

    // No private modifier
    WordReverser reverser = new WordReverser();

    @Test
    void testSingleWordOdd() {
        assertEquals("sananaB", reverser.reverseOdd("Bananas"));
    }

    @Test
    void testMultipleWords() {
        // "One" (3), "two" (3), "three" (5) are odd. "four" (4) is even.
        assertEquals("enO owt eerht four", reverser.reverseOdd("One two three four"));
    }

    @Test
    void testSentenceCorrection() {
        String input = "Make sure uoy only esrever sdrow of ddo length";
        String expected = "Make sure you only reverse words of odd length";
        assertEquals(expected, reverser.reverseOdd(input));
    }

    @Test
    void testEmptyString() {
        assertEquals("", reverser.reverseOdd(""));
    }
}