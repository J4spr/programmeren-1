package Week11.WinkelMandje;

import java.util.Objects;

abstract class Item {
    private String id;
    private double price;

    public Item(String id, double price){
        this.id = id;
        this.price = price;
    }

    public String getId() {
        return this.id;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(id, item.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
