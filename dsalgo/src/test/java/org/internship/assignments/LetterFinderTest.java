package org.internship.assignments;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LetterFinderTest {

    // Default package-private access (no "private" keyword)
    LetterFinder finder = new LetterFinder();

    @Test
    void testMissingLowercase() {
        char[] input = {'a', 'b', 'c', 'd', 'f'};
        char result = finder.findMissingLetter(input);
        assertEquals('e', result, "The missing letter between d and f should be e");
    }

    @Test
    void testMissingUppercase() {
        char[] input = {'O', 'Q', 'R', 'S'};
        char result = finder.findMissingLetter(input);
        assertEquals('P', result, "The missing letter between O and Q should be P");
    }

    @Test
    void testMissingLaterInAlphabet() {
        char[] input = {'x', 'z'};
        char result = finder.findMissingLetter(input);
        assertEquals('y', result);
    }
}