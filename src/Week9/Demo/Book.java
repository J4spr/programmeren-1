package Week9.Demo;

public class Book implements Comparable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public boolean isSmallerThan(Comparable other) {
        if (!(other instanceof Book otherBook)) {
            return false;
        }
        int c = this.author.compareTo(otherBook.author);
        return c < 0;
    }

    @Override
    public boolean isGreaterThan(Comparable other) {
        if (!(other instanceof Book otherBook)) {
            return false;
        }
        int c = this.author.compareTo(otherBook.author);
        return c > 0;
    }

    @Override
    public boolean isEqualTo(Comparable other) {
        if (!(other instanceof Book otherBook)) {
            return false;
        }
        int c = this.author.compareTo(otherBook.author);
        return c == 0;
    }
}
