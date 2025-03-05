package com.designPattern.component;


import com.designPattern.mediator.SmartHomeMediator;

public abstract class SmartDevice {
    protected SmartHomeMediator mediator;
    protected String name;

    public SmartDevice(SmartHomeMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
        mediator.registerDevice(this);
    }

    public abstract void sendCommand(String command);
    public abstract void receiveCommand(String command);
}
