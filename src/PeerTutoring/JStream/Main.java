package PeerTutoring.JStream;

import be.kdg.progfun.jstream.MusicLibrary;
import be.kdg.progfun.jstream.Song;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        be.kdg.progfun.jstream.MusicLibrary spotify = new MusicLibrary();

        be.kdg.progfun.jstream.Song s1 = new be.kdg.progfun.jstream.Song("Hello", "Adele", 295, 5000);
        be.kdg.progfun.jstream.Song s2 = new be.kdg.progfun.jstream.Song("Hello", "Adele", 300, 100); // Should be considered a duplicate!
        be.kdg.progfun.jstream.Song s3 = new be.kdg.progfun.jstream.Song("Bohemian Rhapsody", "Queen", 354, 9999);
        be.kdg.progfun.jstream.Song s4 = new be.kdg.progfun.jstream.Song("Someone Like You", "Adele", 285, 4000);

        System.out.println("--- Adding Songs ---");
        spotify.addSong(s1);
        spotify.addSong(s2); // Should fail/ignore
        spotify.addSong(s3);
        spotify.addSong(s4);

        System.out.println("--- Testing Duplicates ---");
        // Print total number of songs in library (Should be 3, not 4)

        System.out.println("--- Testing Map ---");
        System.out.println("Songs by Adele: " + spotify.getSongsByArtist("Adele"));

        System.out.println("--- Testing Sort ---");
        List<be.kdg.progfun.jstream.Song> sorted = spotify.getTopSongs();
        for (Song s : sorted) {
            System.out.println(s);
        }
    }
}

