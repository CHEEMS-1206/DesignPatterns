package com.designPatterns.command;
import com.designPatterns.receiver.Canvas;

public class EraseCommand implements Command {
    private Canvas canvas;
    private String shape;

    public EraseCommand(Canvas canvas, String shape) {
        this.canvas = canvas;
        this.shape = shape;
    }

    @Override
    public void execute() {
        canvas.erase(shape);
    }

    @Override
    public void undo() {
        canvas.draw(shape);
    }
}
