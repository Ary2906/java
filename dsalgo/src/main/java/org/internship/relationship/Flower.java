package org.internship.relationship;

import java.util.List;

class Flower {
    String type;
    Flower(String type) { this.type = type; }
}

class Bouquet {
    List<Flower> flowers;
    Bouquet(List<Flower> flowers) { this.flowers = flowers; }
}