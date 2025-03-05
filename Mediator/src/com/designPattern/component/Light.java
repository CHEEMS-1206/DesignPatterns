package com.designPattern.component;

import com.designPattern.mediator.SmartHomeMediator;

public class Light extends SmartDevice {
    public Light(SmartHomeMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendCommand(String command) {
        System.out.println(name + " sending command: " + command);
        mediator.sendCommand(command, this);
    }

    @Override
    public void receiveCommand(String command) {
        if (command.equals("Turn On Lights")) {
            System.out.println(name + " is now ON.");
        } else if (command.equals("Turn Off Lights")) {
            System.out.println(name + " is now OFF.");
        }
    }
}
