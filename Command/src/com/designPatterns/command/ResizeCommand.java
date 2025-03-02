package com.designPatterns.command;
import com.designPatterns.receiver.Canvas;

public class ResizeCommand implements Command {
    private Canvas canvas;
    private String shape;
    private int oldSize;
    private int newSize;

    public ResizeCommand(Canvas canvas, String shape, int oldSize, int newSize) {
        this.canvas = canvas;
        this.shape = shape;
        this.oldSize = oldSize;
        this.newSize = newSize;
    }

    @Override
    public void execute() {
        canvas.resize(shape, oldSize, newSize);
    }

    @Override
    public void undo() {
        canvas.resize(shape, newSize, oldSize);
    }
}