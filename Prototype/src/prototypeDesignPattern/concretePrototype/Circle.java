package prototypeDesignPattern.concretePrototype;

import prototypeDesignPattern.prototype.Shape;

public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this.radius); // Clone by creating a new instance
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius " + radius);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

