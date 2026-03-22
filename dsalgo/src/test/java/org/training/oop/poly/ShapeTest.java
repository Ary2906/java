package org.training.oop.poly;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {
    @Test
    void testRuntimePolymorphism() {
        // Parent reference, Child object
        Shape myShape = new Circle();
        assertEquals("Drawing a Circle", myShape.draw());

        myShape = new Square();
        assertEquals("Drawing a Square", myShape.draw());
    }
}
