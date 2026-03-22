
package org.internship.condionals;

public class DoWhileDemo {

    public void countAtLeastOnce(int number) {
        // Even if 'number' is already 0, this will print once!
        do {
            System.out.println("Do-While count: " + number);
            number--;
        } while (number > 0);
    }
}