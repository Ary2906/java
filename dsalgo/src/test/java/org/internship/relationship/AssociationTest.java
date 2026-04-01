package org.internship.relationship;

public class AssociationTest {
    public static void main(String[] args) {
        Bus route42 = new Bus(42);
        Commuter person = new Commuter();
        person.ride(route42); // Association happens here
    }
}