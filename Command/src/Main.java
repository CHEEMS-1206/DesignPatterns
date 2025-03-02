import com.designPatterns.command.Command;
import com.designPatterns.command.DrawCommand;
import com.designPatterns.command.EraseCommand;
import com.designPatterns.command.ResizeCommand;
import com.designPatterns.invoker.CommandManager;
import com.designPatterns.receiver.Canvas;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        CommandManager manager = new CommandManager();

        // Drawing a Circle
        Command drawCircle = new DrawCommand(canvas, "Circle");
        manager.executeCommand(drawCircle);

        // Resizing the Circle from size 10 to 20
        Command resizeCircle = new ResizeCommand(canvas, "Circle", 10, 20);
        manager.executeCommand(resizeCircle);

        // Erasing the Circle
        Command eraseCircle = new EraseCommand(canvas, "Circle");
        manager.executeCommand(eraseCircle);

        // Undo last command (Erasing)
        System.out.println("\nUndoing last command...");
        manager.undoLastCommand();

        // Undo resizing
        System.out.println("\nUndoing last command...");
        manager.undoLastCommand();

        // Undo drawing
        System.out.println("\nUndoing last command...");
        manager.undoLastCommand();
    }
}