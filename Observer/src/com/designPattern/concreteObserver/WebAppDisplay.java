package com.designPattern.concreteObserver;

import com.designPattern.observer.Observer;

public class WebAppDisplay implements Observer {
    private String name;

    public WebAppDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature) {
        System.out.println(name + " Web App Display: Temperature updated to " + temperature + "°C");
    }
}
