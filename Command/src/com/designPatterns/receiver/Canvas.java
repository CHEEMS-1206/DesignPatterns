package com.designPatterns.receiver;

public class Canvas {
    public void draw(String shape) {
        System.out.println("Drawing: " + shape);
    }

    public void erase(String shape) {
        System.out.println("Erasing: " + shape);
    }

    public void resize(String shape, int oldSize, int newSize) {
        System.out.println("Resizing " + shape + " from " + oldSize + " to " + newSize);
    }
}
