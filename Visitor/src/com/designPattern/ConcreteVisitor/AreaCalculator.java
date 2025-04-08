package com.designPattern.ConcreteVisitor;

// /visitor/AreaCalculator.java

import com.designPattern.ConcreteElement.Circle;
import com.designPattern.ConcreteElement.Rectangle;
import com.designPattern.Visitor.ShapeVisitor;

public class AreaCalculator implements ShapeVisitor {
    public void visit(Circle circle) {
        double area = Math.PI * circle.radius * circle.radius;
        System.out.println("Area of Circle: " + area);
    }

    public void visit(Rectangle rectangle) {
        double area = rectangle.width * rectangle.height;
        System.out.println("Area of Rectangle: " + area);
    }
}
