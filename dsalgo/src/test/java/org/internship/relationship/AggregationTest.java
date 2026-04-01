package org.internship.relationship;

import java.util.*;

public class AggregationTest {
    public static void main(String[] args) {
        Flower f1 = new Flower("Rose");
        List<Flower> list = new ArrayList<>();
        list.add(f1);

        Bouquet myBouquet = new Bouquet(list);
        myBouquet = null; // Bouquet destroyed, but f1 (the Rose) still exists!
        System.out.println("Flower still exists: " + f1.type);
    }
}