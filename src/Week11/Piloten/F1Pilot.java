package Week11.Piloten;

import java.util.Set;

public class F1Pilot {
    private String nationality;
    private String name;
    private int numberOfTitles;
    private Set<Integer> seasons;

    public F1Pilot(String nationality, String name, int numberOfTitles) {
        this.nationality = nationality;
        this.name = name;
        this.numberOfTitles = numberOfTitles;
    }

}
