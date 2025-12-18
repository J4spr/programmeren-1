package PeerTutoring.Bakery;

public enum Topping {
    CHOCOLATE, ALMOND, CINNAMON, PLAIN;


    @Override
    public String toString() {
        return this.name().charAt(0) + this.name().substring(1).toLowerCase();
    }
}
