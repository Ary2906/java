package org.internship.assignments;

public class WordReverser {

    public String reverseOdd(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }

        // 1. Split sentence into words
        String[] words = sentence.split(" ");

        // 2. Loop through each word
        for (int i = 0; i < words.length; i++) {
            // Check if length is odd
            if (words[i].length() % 2 != 0) {
                // Reverse the word using StringBuilder
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }

        // 3. Join words back with spaces
        return String.join(" ", words);
    }
}