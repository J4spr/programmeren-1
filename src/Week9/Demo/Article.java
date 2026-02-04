package Week9.Demo;

public class Article implements Comparable {
    private String title;
    private String author;

    public Article(String title, String author) {
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
        if (!(other instanceof Article otherArticle)) {
            return false;
        }
        int c = this.author.compareTo(otherArticle.author);
        return c < 0;
    }

    @Override
    public boolean isGreaterThan(Comparable other) {
        if (!(other instanceof Article otherArticle)) {
            return false;
        }
        int c = this.author.compareTo(otherArticle.author);
        return c > 0;
    }

    @Override
    public boolean isEqualTo(Comparable other) {
        if (!(other instanceof Article otherArticle)) {
            return false;
        }
        int c = this.author.compareTo(otherArticle.author);
        return c == 0;
    }
}
