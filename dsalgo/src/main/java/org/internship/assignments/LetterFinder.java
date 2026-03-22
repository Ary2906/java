package org.internship.assignments;

public class LetterFinder {

    public char findMissingLetter(char[] letters) {
        // Logic matches your JS: Check the difference between consecutive letters
        for (int i = 0; i < letters.length - 1; i++) {
            // In Java, 'b' - 'a' equals 1. If it's 2, a letter is missing.
            if (letters[i + 1] - letters[i] != 1) {
                // Return the letter immediately following the current one
                return (char) (letters[i] + 1);
            }
        }

        return ' '; // Default return if nothing is missing
    }
}