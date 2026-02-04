package be.kdg.progfun.jstream;

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

    public String getArtist() { return artist; }
    public String getTitle() { return title; }
    public int getPlayCount() { return playCount; }
    public int getDuration() { return duration; }

    @Override
    public String toString() {
        return String.format("%s by %s (%ds) - %d plays", title, artist, duration, playCount);
    }

    // TODO: Something is missing here to make Sets work correctly...
}
