package com.designPatterns.concreteIterartor;

import com.designPatterns.models.Song;

import java.util.Iterator;
import java.util.List;

public class DefaultIterator implements Iterator<Song> {
    private List<Song> songs;
    private int index = 0;

    public DefaultIterator(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public boolean hasNext() {
        return index < songs.size();
    }

    @Override
    public Song next() {
        return songs.get(index++);
    }
}
