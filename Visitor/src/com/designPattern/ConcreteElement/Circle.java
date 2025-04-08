package com.designPattern.ConcreteElement;

// /element/Circle.java
import com.designPattern.Element.Shape;
import com.designPattern.Visitor.ShapeVisitor;

public class Circle implements Shape {
    public double radius = 5;

    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}