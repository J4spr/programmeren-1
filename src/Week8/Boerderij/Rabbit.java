package Week8.Boerderij;

public class Rabbit extends FarmAnimal {
    private boolean likesDigging;

    public Rabbit(String name, boolean likesDigging) {
        super(name, "SnifSnif", "Gras");
        this.likesDigging = likesDigging;
    }

    public boolean isLikesDigging() {
        return this.likesDigging;
    }

    @Override
    public String toString() {
        return String.format("%s en graaft %b", super.toString(), this.likesDigging ? "niet graag" : "graag");
    }
}
