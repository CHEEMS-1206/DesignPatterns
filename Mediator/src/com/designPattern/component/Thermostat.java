package com.designPattern.component;

import com.designPattern.mediator.SmartHomeMediator;

public class Thermostat extends SmartDevice {
    public Thermostat(SmartHomeMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendCommand(String command) {
        System.out.println(name + " sending command: " + command);
        mediator.sendCommand(command, this);
    }

    @Override
    public void receiveCommand(String command) {
        if (command.equals("Increase Temperature")) {
            System.out.println(name + " increasing temperature.");
        } else if (command.equals("Decrease Temperature")) {
            System.out.println(name + " decreasing temperature.");
        }
    }
}
