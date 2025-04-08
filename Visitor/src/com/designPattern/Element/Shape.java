package com.designPattern.Element;

// /element/Shape.java
import com.designPattern.Visitor.ShapeVisitor;

public interface Shape {
    void accept(ShapeVisitor visitor);
}
