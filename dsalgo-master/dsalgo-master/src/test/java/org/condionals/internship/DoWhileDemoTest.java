package org.condionals.internship;

import org.internship.condionals.DoWhileDemo;
import org.junit.jupiter.api.Test;

class DoWhileDemoTest {

    @Test
    void testDoWhileExecution() {
        DoWhileDemo demo = new DoWhileDemo();

        System.out.println("--- Scenario 1: Number is 3 ---");
        demo.countAtLeastOnce(3);

        System.out.println("\n--- Scenario 2: Number is -5 (The 'At Least Once' proof) ---");
        demo.countAtLeastOnce(-5);
    }
}