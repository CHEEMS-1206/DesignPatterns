package com.designPatterns.concreteIterartor;

import com.designPatterns.models.Song;

import java.util.*;

public class RandomIterator implements Iterator<Song> {
    private List<Song> shuffledSongs;
    private int index = 0;

    public RandomIterator(List<Song> songs) {
        shuffledSongs = new ArrayList<>(songs);
        Collections.shuffle(shuffledSongs);
    }

    @Override
    public boolean hasNext() {
        return index < shuffledSongs.size();
    }

    @Override
    public Song next() {
        return shuffledSongs.get(index++);
    }
}
