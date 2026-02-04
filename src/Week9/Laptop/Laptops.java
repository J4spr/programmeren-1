package Week9.Laptop;

public class Laptops {
    static int amount;
    Laptop[] laptops;

    public Laptops() {
        this.laptops = new Laptop[2000];
        amount = 0;
        amount++;
    }

    public static int getAmount() {
        return amount;
    }

    public Laptop getLaptop(int index) {
        if (index > amount)
            return null;
        return laptops[index];
    }

    public void addLaptop(Laptop laptop) {
        if (this.laptops.length - 1 == amount) {
            laptops[laptops.length - 1] = laptop;
        }
        laptops[amount++] = laptop;
    }
}
