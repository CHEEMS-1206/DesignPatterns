package com.designPatterns.RefinedAbstraction;

import com.designPatterns.Abstraction.Shape;
import com.designPatterns.Implementation.Color;

public class CircleShape extends Shape {
    public CircleShape(Color color) {
        super(color);
    }
    public void draw() {
        System.out.print("Drawing Square ");
        color.applyColor();
    }
}
