package org.internship.methods;

public class LevelTest {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;

        // Enums are great for switch statements
        switch(myVar) {
            case LOW: System.out.println("Low Level"); break;
            case MEDIUM: System.out.println("Medium Level"); break;
            case HIGH: System.out.println("High Level"); break;
        }
    }
}