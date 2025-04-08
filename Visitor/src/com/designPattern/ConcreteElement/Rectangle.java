package com.designPattern.ConcreteElement;

// /element/Rectangle.java
import com.designPattern.Element.Shape;
import com.designPattern.Visitor.ShapeVisitor;

public class Rectangle implements Shape {
    public double width = 10;
    public double height = 20;

    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
