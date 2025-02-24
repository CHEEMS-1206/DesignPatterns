package com.designPatterns.flyweightClass;

public class TreeType {
    private String name;
    private String color;
    private int val;

    public TreeType(String name, String color,int val) {
        this.name = name;
        this.color = color;
        this.val = val;
    }

    public void draw(int x, int y) {
        System.out.println("Drawing " + name + " tree of color " + color + " at (" + x + "," + y + ")" + " having value " + val);
    }
}
