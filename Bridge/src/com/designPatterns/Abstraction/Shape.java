package com.designPatterns.Abstraction;

import com.designPatterns.Implementation.Color;

public abstract class Shape {
    //reference to implementation
    protected Color color;

    public Shape(Color color){
        this.color = color;
    }
    public abstract void draw();
}
