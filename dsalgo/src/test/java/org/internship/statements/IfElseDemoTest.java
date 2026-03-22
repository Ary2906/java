package org.internship.statements;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IfElseDemoTest {

    @Test
    void testGrades() {
        IfElseDemo demo = new IfElseDemo();
        assertEquals("Grade A", demo.checkExamResult(95));
        assertEquals("Grade B", demo.checkExamResult(80));
        assertEquals("Fail", demo.checkExamResult(40));
    }

    @Test
    void testVotingEligibility() {
        IfElseDemo demo = new IfElseDemo();
        assertTrue(demo.canVote(20, true));
        assertFalse(demo.canVote(16, true));
        assertFalse(demo.canVote(25, false));
    }
}