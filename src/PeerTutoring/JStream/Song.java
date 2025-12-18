package PeerTutoring.JStream;

import java.util.Objects;

public class Song {
    private String title;
    private String artist;
    private int duration;
    private int playCount;

    public Song(String title, String artist, int duration, int playCount) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.playCount = playCount;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    public int getPlayCount() {
        return playCount;
    }

    @Override
    public String toString() {
        int minutes = duration / 60;
        int seconds = duration % 60;
        return String.format("%s - %s (%d:%02d) [Plays: %d]",
                artist, title, minutes, seconds, playCount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Song song = (Song) o;

        return Objects.equals(title, song.title) &&
                Objects.equals(artist, song.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist);
    }
}