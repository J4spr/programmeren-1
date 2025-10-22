package Week5;

public class Bibliotheek {
    public static void main(String[] args) {
        Book book1 = new Book("Y. Daniel Liang", "Introduction to Java programming", 1240);
        book1.setBorrowed(true);
        book1.printDetails();

        Book book2 = new Book();
        book2.setNumberOfPages(291);
        book2.setAuthor("Louis Paul Boon");
        book2.setTitle("De kapellekensbaan");
        book2.printDetails();

        Book book3 = new Book("Jef Geeraerts", "Drugs", 333);
        book3.setBorrowed(true);
        book3.printDetails();
    }
}

class Book {
    private String author;
    private String title;
    private int numOfpages;
    private boolean borrowed;

    public Book(String author, String title, int numOfpages) {
        this.author = author;
        this.title = title;
        this.numOfpages = numOfpages;
    }
    public Book(){
        Book book = new Book("onbekend", "onbekend", 0);
    }


    public void setBorrowed(boolean b) {
        this.borrowed = b;
    }

    public void printDetails() {
        String ifBorrowed = String.format("Het boek %s (%d  pagina's), geschreven door %s, is momenteel ontleend\n", this.title, this.numOfpages, this.author);
        String ifNotBorrowed = String.format("Het boek %s (%d  pagina's), geschreven door %s, is niet ontleend\n", this.title, this.numOfpages, this.author);
        System.out.print((this.borrowed) ? ifBorrowed : ifNotBorrowed);
    }

    public void setNumberOfPages(int numOfpages) {
        this.numOfpages = numOfpages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}