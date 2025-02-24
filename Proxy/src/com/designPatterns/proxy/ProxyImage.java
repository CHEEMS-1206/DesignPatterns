package com.designPatterns.proxy;

import com.designPatterns.subject.Image;
import com.designPatterns.subject.RealImage;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename); // Load only when needed
        }
        realImage.display();
    }
}

