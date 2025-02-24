package com.designPatterns.subSystemClasses;

public class Projector {
    public void on() {
        System.out.println("Projector is ON.");
    }
    public void setInput(DVDPlayer dvd) {
        System.out.println("Projector input set to DVD Player.");
    }
    public void off() {
        System.out.println("Projector is OFF.");
    }
}

