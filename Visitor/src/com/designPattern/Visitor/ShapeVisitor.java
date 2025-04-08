package com.designPattern.Visitor;

import com.designPattern.ConcreteElement.Circle;
import com.designPattern.ConcreteElement.Rectangle;

// /visitor/ShapeVisitor.java
public interface ShapeVisitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
}
