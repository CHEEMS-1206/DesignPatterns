package com.designPatterns.command;
import com.designPatterns.receiver.Canvas;

public class DrawCommand implements Command {
    private Canvas canvas;
    private String shape;

    public DrawCommand(Canvas canvas, String shape) {
        this.canvas = canvas;
        this.shape = shape;
    }

    @Override
    public void execute() {
        canvas.draw(shape);
    }

    @Override
    public void undo() {
        canvas.erase(shape);
    }
}