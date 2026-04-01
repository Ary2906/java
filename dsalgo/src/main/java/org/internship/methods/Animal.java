package org.internship.methods;

// Interface: A contract for behavior
interface Pet {
    void play();
}

// Abstract Class: A partial blueprint
abstract class Animal {
    String name;
    Animal(String name) { this.name = name; }

    // Abstract method: Must be implemented by children
    abstract void makeNoise();

    // Concrete method: Already has logic
    void sleep() { System.out.println(name + " is sleeping..."); }
}

class Dog extends Animal implements Pet {
    Dog(String name) { super(name); }

    @Override
    void makeNoise() { System.out.println("Woof!"); }

    @Override
    public void play() { System.out.println(name + " is fetching a ball."); }
}