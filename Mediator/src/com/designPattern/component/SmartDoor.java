package com.designPattern.component;


import com.designPattern.mediator.SmartHomeMediator;

public class SmartDoor extends SmartDevice {
    public SmartDoor(SmartHomeMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendCommand(String command) {
        System.out.println(name + " sending command: " + command);
        mediator.sendCommand(command, this);
    }

    @Override
    public void receiveCommand(String command) {
        if (command.equals("Lock Door")) {
            System.out.println(name + " is now LOCKED.");
        } else if (command.equals("Unlock Door")) {
            System.out.println(name + " is now UNLOCKED.");
        }
    }
}
