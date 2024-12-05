package prototypeDesignPattern.concretePrototype;

import prototypeDesignPattern.prototype.Shape;
import java.util.ArrayList;
import java.util.List;

public class Layer {
    private List<Shape> shapes;

    public Layer() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public Layer clone() {
        Layer clonedLayer = new Layer();
        for (Shape shape : shapes) {
            clonedLayer.addShape(shape.clone()); // Clone each shape in the layer
        }
        return clonedLayer;
    }

    public void draw() {
        System.out.println("Drawing the Layer:");
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}

