package com.designPatterns.models;

public class Song {
    private String name;
    private String artist;

    public Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " by " + artist;
    }
}