package org.internship.methods;

public class AnimalTest {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");

        myDog.makeNoise(); // From Abstract implementation
        myDog.sleep();     // From Abstract concrete method
        myDog.play();      // From Interface implementation
    }
}