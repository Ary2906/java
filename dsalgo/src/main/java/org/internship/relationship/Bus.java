package org.internship.relationship;

class Bus {
    int busNumber;
    Bus(int n) { this.busNumber = n; }
}

class Commuter {
    void ride(Bus b) {
        System.out.println("Riding bus: " + b.busNumber);
    }
}