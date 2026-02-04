package Week11.WinkelMandje;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShoppingBasket {
    private Set<OrderLine> orderLines;

    public ShoppingBasket() {
        orderLines = new HashSet<>();
    }

    public void addItem(Item item) {
        OrderLine existingLine = null;

        for (OrderLine line : orderLines) {
            if (line.getItem().equals(item)) {
                existingLine = line;
                break;
            }
        }

        if (existingLine != null) {
            int currentAmount = existingLine.getAmount();

            orderLines.remove(existingLine);

            orderLines.add(new OrderLine(item, currentAmount + 1));

        } else {
            orderLines.add(new OrderLine(item, 1));
        }
    }

    public void removeItem(Item item) {
        OrderLine lineToRemove = null;

        for (OrderLine line : orderLines) {
            if (line.getItem().equals(item)) {
                lineToRemove = line;
                break;
            }
        }

        if (lineToRemove != null) {
            if (lineToRemove.getAmount() > 1) {
                int newAmount = lineToRemove.getAmount() - 1;

                orderLines.remove(lineToRemove);
                orderLines.add(new OrderLine(item, newAmount));
            }
            else {
                orderLines.remove(lineToRemove);
            }
        }
    }
    public List<OrderLine> itemsSortedById(){
        return this.orderLines.stream().sorted().toList();
    }
}