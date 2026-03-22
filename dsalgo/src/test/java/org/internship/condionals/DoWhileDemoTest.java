package org.internship.condionals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DoWhileDemoTest {

    @Test
    void loopCountInDoWhileTest() {
        DoWhileDemo doWhileDemo = new DoWhileDemo();
        assertEquals(3, doWhileDemo.loopCountInDoWhile(3), "Loop count should be 3");
    }

    @Test
    void loopCountInDoWhileTestWithOne() {
        DoWhileDemo doWhileDemo = new DoWhileDemo();
        assertEquals(1, doWhileDemo.loopCountInDoWhile(1), "Loop count should be 1");
    }

    @Test
    void loopCountInDoWhileTestWithZero() {
        DoWhileDemo doWhileDemo = new DoWhileDemo();
        assertEquals(1, doWhileDemo.loopCountInDoWhile(0), "Loop count should be 1");
    }

    @Test
    void loopCountInDoWhileTestWithNegative() {
        DoWhileDemo doWhileDemo = new DoWhileDemo();
        assertEquals(1, doWhileDemo.loopCountInDoWhile(-19), "Loop count should be 1");
    }
}