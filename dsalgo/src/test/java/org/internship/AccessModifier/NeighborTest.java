package org.internship.AccessModifier;

public class NeighborTest {
    public static void main(String[] args) {
        Neighbor n = new Neighbor();
        // Works because they are in the same folder/package
        System.out.println("Checking neighbor's fence: " + n.sharedFence);
    }
}