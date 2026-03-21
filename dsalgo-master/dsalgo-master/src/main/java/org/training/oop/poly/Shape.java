package org.training.oop.poly;

public class Shape {
    public String draw() {
        return "Drawing a generic shape";
    }
}

class Circle extends Shape {
    @Override
    public String draw() {
        return "Drawing a Circle";
    }
}

class Square extends Shape {
    @Override
    public String draw() {
        return "Drawing a Square";
    }
}
