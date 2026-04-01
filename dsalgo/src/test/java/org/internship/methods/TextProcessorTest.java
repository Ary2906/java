package org.internship.methods;

public class TextProcessorTest {
    public static void main(String[] args) {
        String s1 = "  hello world  ";
        TextProcessor tp = new TextProcessor();

        String result = tp.clean(s1);

        System.out.println("Original: '" + s1 + "'");
        System.out.println("Cleaned: '" + result + "'");

        // String comparison - ALWAYS use .equals(), never ==
        String s2 = "HELLO WORLD";
        System.out.println("Match? " + result.equals(s2));
    }
}