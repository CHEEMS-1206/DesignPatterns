package prototypeDesignPattern.concretePrototype;

import prototypeDesignPattern.prototype.Shape;

public class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this.width, this.height); // Clone by creating a new instance
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with width " + width + " and height " + height);
    }

    public void setDimensions(int width, int height) {
        this.width = width;
        this.height = height;
    }
}

