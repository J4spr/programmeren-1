package Week7.Films;

public class Movie {
    private String title;
    private int year;

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    @Override
    public String toString() {
        return String.format("%s %d", this.title, this.year);
    }
}

