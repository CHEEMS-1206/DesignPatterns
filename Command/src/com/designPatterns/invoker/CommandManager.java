package com.designPatterns.invoker;

import java.util.Stack;

import com.designPatterns.command.Command;

public class CommandManager {
    private Stack<Command> history = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
    }

    public void undoLastCommand() {
        if (!history.isEmpty()) {
            Command lastCommand = history.pop();
            lastCommand.undo();
        } else {
            System.out.println("No commands to undo.");
        }
    }
}