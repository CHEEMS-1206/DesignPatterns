package com.designPatterns.concreteIterartor;

import com.designPatterns.models.Song;

import java.util.*;

public class SortedIterator implements Iterator<Song> {
    private List<Song> sortedSongs;
    private int index = 0;

    public SortedIterator(List<Song> songs) {
        sortedSongs = new ArrayList<>(songs);
        sortedSongs.sort(Comparator.comparing(Song::getName));
    }

    @Override
    public boolean hasNext() {
        return index < sortedSongs.size();
    }

    @Override
    public Song next() {
        return sortedSongs.get(index++);
    }
}
