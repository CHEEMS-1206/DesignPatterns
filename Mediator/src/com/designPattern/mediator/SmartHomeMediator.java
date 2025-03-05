package com.designPattern.mediator;


import com.designPattern.component.SmartDevice;

public interface SmartHomeMediator {
    void registerDevice(SmartDevice device);
    void sendCommand(String command, SmartDevice sender);
}
