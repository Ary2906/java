package org.internship.relationship;

public class ObjectTest {
    public static void main(String[] args) {
        Product p1 = new Product(101);
        Product p2 = new Product(101);

        System.out.println(p1); // Triggers toString()
        System.out.println("Are they equal? " + p1.equals(p2)); // true
    }
}