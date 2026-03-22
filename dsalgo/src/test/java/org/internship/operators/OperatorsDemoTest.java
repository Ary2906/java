package org.internship.operators;


import org.junit.jupiter.api.Test;




class OperatorsDemoTest {

    @Test
    void testAllOperators() {
        OperatorsDemo demo = new OperatorsDemo();

        int mathResult = demo.performArithmetic(10, 5);
        System.out.println("Arithmetic Output: " + mathResult);

        boolean logicResult = demo.checkLogic(20, true);
        System.out.println("Logical (AND) Output: " + logicResult);

        int compoundResult = demo.useCompound(5);
        System.out.println("Compound Assignment Output: " + compoundResult);

        String ternaryResult = demo.checkTernary(45);
        System.out.println("Ternary Output: " + ternaryResult);
    }
}