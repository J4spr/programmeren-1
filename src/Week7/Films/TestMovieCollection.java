package Week7.Films;

public class TestMovieCollection {
    public static void main(String[] args) {
        MovieCollection collection = new MovieCollection();
        collection.addMovie(new Movie("Batman", 1989));
        collection.addMovie(new Movie("When Harry Met Sally", 1989));
        collection.addMovie(new Movie("Dances With Wolves", 1990));
        collection.addMovie(new Movie("Pretty Woman", 1990));
        collection.addMovie(new Movie("Total Recal", 1990));
        collection.addMovie(new Movie("Thelma & Louise", 1991));
        collection.addMovie(new Movie("The Silence Of The Lambs", 1991));
        collection.addMovie(new Movie("Reservoir Dogs", 1992));
        collection.addMovie(new Movie("Jurassic Park", 1993));
        collection.addMovie(new Movie("Schindler's List", 1993));

        Movie[] movies = collection.getMovies();
        for (int i = 0; i < collection.getIndex(); i++) {
            System.out.printf("%s", movies[i]);
        }
        if (collection.getIsFull())
            System.out.println("De collectie is vol!");
        else
            System.out.println("De collectie is niet vol!");
    }
}