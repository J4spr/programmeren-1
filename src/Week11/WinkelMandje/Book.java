package Week11.WinkelMandje;

import java.util.ArrayList;
import java.util.List;

public class Book extends Item {
    private String title;
    private List<String> authors;

    public Book(String id, double price, String title, String author) {
        super(id, price);
        this.title = title;
        this.authors = new ArrayList<>();
    }

}
