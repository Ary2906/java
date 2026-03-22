package org.training.oop.inheritance.interfaces;
interface Mother {
    default void cook() {
        System.out.println("Mother is cooking Pasta.");
    }
}

interface Father {
    default void cook() {
        System.out.println("Father is cooking Steak.");
    }
}

// This will NOT compile unless we override the cook() method
class Son implements Mother, Father {

    @Override
    public void cook() {
        // We must explicitly choose which one to use,
        // or write a whole new logic for the Son.

        // To use Mother's version:
        Mother.super.cook();

        // To use Father's version:
         Father.super.cook();

        System.out.println("Son is also setting the table.");
    }
}
public class Main {
    public static void main(String[] args) {
        Son s=new Son();
        s.cook();
    }
}
