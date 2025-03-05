package com.designPattern.concreteMediator;


import com.designPattern.component.SmartDevice;
import com.designPattern.mediator.SmartHomeMediator;

import java.util.ArrayList;
import java.util.List;

public class HomeAutomationHub implements SmartHomeMediator {
    private List<SmartDevice> devices = new ArrayList<>();

    @Override
    public void registerDevice(SmartDevice device) {
        devices.add(device);
    }

    @Override
    public void sendCommand(String command, SmartDevice sender) {
        for (SmartDevice device : devices) {
            if (device != sender) {
                device.receiveCommand(command);
            }
        }
    }
}

