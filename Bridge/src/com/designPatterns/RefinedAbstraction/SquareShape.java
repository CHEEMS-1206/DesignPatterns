package com.designPatterns.RefinedAbstraction;

import com.designPatterns.Abstraction.Shape;
import com.designPatterns.Implementation.Color;


public class SquareShape extends Shape {
    public SquareShape(Color color) {
        super(color);
    }
    public void draw() {
        System.out.print("Drawing Square ");
        color.applyColor();
    }
}
