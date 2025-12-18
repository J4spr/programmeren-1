package PeerTutoring.Bakery;

public class Bakery {
    private final int MAX_PRODUCTS = 10;
    private Product[] products;
    private int count = 0;

    public Bakery() {
        this.products = new Product[MAX_PRODUCTS];
        this.count = 0;
    }

    public boolean addProduct(Product p) {
        if (count >= MAX_PRODUCTS)
            return false;
        if (count == products.length)
            return false;
        products[count + 1] = p;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Bakery Products:\n");

        // --- LOOP 1: Filter ONLY for Coffee ---
        // We loop from 0 to 'count' to avoid hitting nulls in the empty array spots
        for (int i = 0; i < count; i++) {
            Product p = products[i];

            if (p instanceof Coffee) {
                Coffee c = (Coffee) p; // Cast to Coffee to access specific fields

                sb.append(c.getName()) // Assuming you have getters or public fields
                        .append(" (expires: ")
                        .append(c.isExpired())
                        .append(")");

                if (c.isVegan()) {
                    sb.append(" [vegan]");
                }
                sb.append("\n");
            }
        }

        // --- LOOP 2: Filter ONLY for CinnamonRolls ---
        for (int i = 0; i < count; i++) {
            Product p = products[i];

            if (p instanceof CinnamonRoll) {
                CinnamonRoll r = (CinnamonRoll) p; // Cast to CinnamonRoll

                sb.append(r.getName())
                        .append(" (expires: ")
                        .append(r.isExpired())
                        .append(") [topping: ")
                        .append(r.isExpired())
                        .append("]\n");
            }
        }

        return sb.toString();
    }
}