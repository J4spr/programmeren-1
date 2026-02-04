package Week11.WinkelMandje;

import java.util.List;

public class Movie extends Item{
    private String title;
    List<String> actors;
    public Movie(String id, double price, String title, String actor){
        super(id, price);
        this.title = title;
        this.actors.add(actor);
    }

    public String getTitle() {
        return this.title;
    }

    public List<String> getActors() {
        return this.actors;
    }
}
