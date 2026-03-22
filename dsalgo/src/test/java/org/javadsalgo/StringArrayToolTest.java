package org.javadsalgo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringArrayToolTest {
    @Test
    void testStringReverse() {
        StringArrayTool tool = new StringArrayTool();
        assertEquals("java", tool.reverseString("avaj"));
    }

    @Test
    void testArrayMax() {
        StringArrayTool tool = new StringArrayTool();
        int[] myNums = {10, 5, 23, 8};
        assertEquals(23, tool.findMax(myNums));
    }
}
