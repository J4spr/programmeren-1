package PeerTutoring.JStream;

import java.util.*;

public class MusicLibrary {
    private Set<Song> songs;

    private Map<String, List<Song>> artistMap;

    public MusicLibrary() {
        this.songs = new HashSet<>();
        this.artistMap = new HashMap<>();
    }

    public boolean addSong(Song s) {
        if (!songs.add(s)) {
            return false;
        }

        String artistName = s.getArtist();

        artistMap.putIfAbsent(artistName, new ArrayList<>());

        artistMap.get(artistName).add(s);

        return true;
    }

    public List<Song> getSongsByArtist(String artist) {
        return artistMap.getOrDefault(artist, new ArrayList<>());
    }

    public List<Song> getTopSongs() {
        List<Song> sortedList = new ArrayList<>(songs);

        Collections.sort(sortedList, new Comparator<Song>() {
            @Override
            public int compare(Song s1, Song s2) {
                int playCompare = Integer.compare(s2.getPlayCount(), s1.getPlayCount());

                if (playCompare != 0) {
                    return playCompare;
                }

                return Integer.compare(s1.getDuration(), s2.getDuration());
            }
        });

        return sortedList;
    }
}