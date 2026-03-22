package org.training.oop.inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    @Test
    void testDeveloperSalaryIncludesBonus() {
        Employee dev = new Developer(); // Polymorphism in action
        assertEquals(40000.0, dev.getSalary());
    }
}
