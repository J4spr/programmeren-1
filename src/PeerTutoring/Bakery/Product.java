package PeerTutoring.Bakery;

import java.time.LocalDate;

public abstract class Product implements Consumable {
    static int totalProducts;
    private String name;
    private double price;
    private LocalDate expirationDate;

    public Product(String name, double price, LocalDate expirationDate) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        totalProducts += 1;
    }

    public static int getTotalProducts() {
        return totalProducts;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public LocalDate getExpirationDate() {
        return this.expirationDate;
    }

}
