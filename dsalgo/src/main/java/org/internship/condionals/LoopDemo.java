
package org.internship.condionals;

public class LoopDemo {

    public String getRepeatMessage(int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += "Java ";
        }
        return result.trim();
    }
}