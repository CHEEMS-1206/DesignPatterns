package prototypeDesignPattern.client;

import prototypeDesignPattern.concretePrototype.Circle;
import prototypeDesignPattern.concretePrototype.Rectangle;
import prototypeDesignPattern.concretePrototype.Layer;
import prototypeDesignPattern.prototype.Shape;

public class PrototypeExample {
    public static void main(String[] args) {
        // Create shapes
        Shape circle1 = new Circle(5);
        Shape rectangle1 = new Rectangle(10, 20);

        // Create a layer and add shapes to it
        Layer layer1 = new Layer();
        layer1.addShape(circle1);
        layer1.addShape(rectangle1);

        // Draw the original layer
        System.out.println("Original Layer:");
        layer1.draw();

        // Clone the layer (with its shapes)
        Layer clonedLayer = layer1.clone();

        // Draw the cloned layer
        System.out.println("\nCloned Layer:");
        clonedLayer.draw();

        // Modify the original shape and see if it affects the clone
        ((Circle)circle1).setRadius(7);
        System.out.println("\nAfter modifying original layer:");
        System.out.println("Original Layer:");
        layer1.draw();
        System.out.println("Cloned Layer:");
        clonedLayer.draw();
    }
}
