package org.internship.AccessModifier;

// We 'extend' Parent to show protected access
public class ParentTest extends Parent {
    public void tryRecipe() {
        // Accessible because ParentTest is a child of Parent
        System.out.println("Cooking with: " + familyRecipe);
    }

    public static void main(String[] args) {
        ParentTest child = new ParentTest();
        child.tryRecipe();
    }
}