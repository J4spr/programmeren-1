package PeerTutoring.Bakery;

import java.time.LocalDate;

public final class Coffee extends Product implements Consumable {
    private boolean vegan;

    public Coffee(String name, double price, LocalDate expirationDate, boolean vegan) {
        super(name, price, expirationDate);
        this.vegan = vegan;
    }

    public String productInfo() {
        return String.format("Coffee: $s €$.2f", super.getName(), super.getPrice());
    }

    @Override
    public boolean isExpired() {
        return !super.getExpirationDate().isAfter(LocalDate.now());
    }

    public boolean isVegan() {
        return this.vegan;
    }
}
