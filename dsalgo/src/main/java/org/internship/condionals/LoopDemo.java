
package org.internship.condionals;

public class LoopDemo {

    public String getRepeatMessage(String msg, int repeatation) {
        String result = "";
        for (int i = 0; i < repeatation; i++) {
            result += msg;
        }
        return result;
    }
}