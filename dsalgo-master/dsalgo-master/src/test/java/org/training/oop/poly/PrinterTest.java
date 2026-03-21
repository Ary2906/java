package org.training.oop.poly;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrinterTest {

    @Test
    void testPrinterFormat() {
        Printer p = new Printer();
        assertEquals("Int: 5", p.format(5));
        assertEquals("String: Hello", p.format("Hello"));
    }
}
