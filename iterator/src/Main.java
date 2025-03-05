import com.designPatterns.models.Song;
import com.designPatterns.concreteCollection.Playlist;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong(new Song("Shape of You", "Ed Sheeran"));
        playlist.addSong(new Song("Blinding Lights", "The Weeknd"));
        playlist.addSong(new Song("Someone Like You", "Adele"));
        playlist.addSong(new Song("Bad Guy", "Billie Eilish"));

        System.out.println("\n🎵 Playing in Default Order:");
        for (Song song : playlist) {
            System.out.println(song);
        }

        System.out.println("\n🎶 Playing in Sorted Order (by Name):");
        Iterator<Song> sortedIterator = playlist.sortedIterator();
        while (sortedIterator.hasNext()) {
            System.out.println(sortedIterator.next());
        }

        System.out.println("\n🔀 Playing in Random Order:");
        Iterator<Song> randomIterator = playlist.randomIterator();
        while (randomIterator.hasNext()) {
            System.out.println(randomIterator.next());
        }
    }
}
