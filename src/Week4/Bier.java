package Week4;

public class Bier {
    public static void main(String[] args) {
        Vat vat = new Vat(15, 15);
        System.out.println(vat.percentageFull());
        System.out.println(vat.isFull());
        vat.tap(3.75);
        System.out.println(vat.getContents());
        System.out.println(vat.percentageFull());
        System.out.println(vat.isFull());

    }
}

class Vat {
    double capacity, contents;

    public Vat(double capacity, double contents) {
        this.capacity = capacity;
        this.contents = contents;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getContents() {
        return this.contents;
    }

    public void setContents(double contents) {
        this.contents = contents;
    }

    public boolean isFull() {
        return this.capacity == this.contents;
    }

    public double tap(double amount) {
        if (this.contents == 0)
            return 0;
        return this.contents -= amount;
    }

    public double percentageFull() {
        double percentage = (this.capacity / this.contents) * 100;
        return percentage;
    }

}
