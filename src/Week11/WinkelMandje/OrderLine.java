package Week11.WinkelMandje;

import java.util.Objects;

public class OrderLine {
    private Item item;
    private int amount;

    public OrderLine(Item item, int amount) {
        this.item = item;
        this.amount = amount;
    }

    public Item getItem() {
        return this.item;
    }

    public int getAmount() {
        return this.amount;
    }

    public double getPrice() {
        return item.getPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        OrderLine orderLine = (OrderLine) o;
        return Objects.equals(item, orderLine.item);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(item);
    }
}
