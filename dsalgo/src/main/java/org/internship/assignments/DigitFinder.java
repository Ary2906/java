package org.internship.assignments;

import java.util.HashSet;
import java.util.Set;

public class DigitFinder {

    public Object findAllDigits(int[] numbers) {
        Set<Integer> foundDigits = new HashSet<>();

//        for (int number : numbers) {
//            // Convert number to string to easily extract digits
//            String numStr = String.valueOf(number);
//
//            for (char c : numStr.toCharArray()) {
//                // Character.getNumericValue converts '5' to 5
//                foundDigits.add(Character.getNumericValue(c));
//            }
//
//            // If we have all digits 0-9 (size is 10)
//            if (foundDigits.size() == 10) {
//                return number;
//            }
//        }


        for (int num : numbers) {
            // Convert the number to a stream of its digits and add to the set
            String.valueOf(num).chars()
                    .map(Character::getNumericValue)
                    .forEach(foundDigits::add);

            // Check if we have collected all digits 0-9
            if (foundDigits.size() == 10) {
                return num;
            }
        }

        return "Missing digits!";
    }
}