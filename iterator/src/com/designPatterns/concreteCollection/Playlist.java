package com.designPatterns.concreteCollection;

import com.designPatterns.concreteIterartor.DefaultIterator;
import com.designPatterns.concreteIterartor.RandomIterator;
import com.designPatterns.concreteIterartor.SortedIterator;
import com.designPatterns.models.Song;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Playlist implements Iterable<Song> {
    private List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    public List<Song> getSongs() {
        return songs;
    }

    // Default Iterator
    @Override
    public Iterator<Song> iterator() {
        return new DefaultIterator(songs);
    }

    // Sorted Iterator (by song name)
    public Iterator<Song> sortedIterator() {
        return new SortedIterator(songs);
    }

    // Random Iterator
    public Iterator<Song> randomIterator() {
        return new RandomIterator(songs);
    }
}

