package PeerTutoring.Bakery;

import java.time.LocalDate;

public class CinnamonRoll extends Product implements Consumable {
    private Topping topping;

    public CinnamonRoll(String name, double price, LocalDate expirationDate, Topping topping) {
        super(name, price, expirationDate);
        this.topping = topping;
    }

    public String productInfo() {
        return String.format("Cinnamonroll: %s met %s, €%.2f", super.getName(), this.topping.name(), super.getPrice());
    }

    @Override
    public boolean isExpired() {
        return !super.getExpirationDate().isAfter(LocalDate.now());

    }
}
