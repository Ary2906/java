
package org.internship.condionals;

public class DoWhileDemo {

    public int loopCountInDoWhile(int number) {
        // Even if 'number' is already 0, this will print once!
        int loopCount = 0;
        do {
            number--;
            loopCount++;
        } while (number > 0);
        return loopCount;
    }
}