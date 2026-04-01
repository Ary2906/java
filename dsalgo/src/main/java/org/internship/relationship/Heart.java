package org.internship.relationship;

class Heart {
    void beat() { System.out.println("Heart beating..."); }
}

class Human {
    private final Heart heart;
    Human() {
        this.heart = new Heart(); // Heart is born with the Human
    }
    void stayAlive() { heart.beat(); }
}