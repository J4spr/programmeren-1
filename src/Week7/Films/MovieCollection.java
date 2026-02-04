package Week7.Films;

public class MovieCollection {
    private final int MAX_SIZE = 9;
    private Movie[] movies;
    private boolean isFull = false;
    private int index;


    public MovieCollection() {
        this.movies = new Movie[MAX_SIZE];
        this.isFull = false;
        this.index = 0;

    }


    public boolean getIsFull() {
        return this.isFull;
    }

    public Movie[] getmovies() {
        return this.movies;
    }

    public void addMovie(Movie movie) {
        if (!isFull) {
            this.movies[this.index] = movie;
            this.index++;
            if (this.index >= this.MAX_SIZE) {
                this.isFull = true;
            }
        }
    }

    public Movie[] getMovies() {
        return this.movies;
    }

    public int getIndex() {
        return this.index;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < movies.length; i++) {
            sb.append(String.format("%s. %s\n", this.getIndex(), movies[i].toString()));
        }
        return sb.toString();

    }
}
