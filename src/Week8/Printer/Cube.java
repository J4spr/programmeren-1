package Week8.Printer;

public class Cube extends Cuboid {
    public Cube(int x, int y, int z, int width) {
        super(x, y, z, width, width, width);
    }

    @Override
    public String toString() {
        return String.format("Balk met admetingen %s en volume %.2f", super.toString(), super.volume());
    }
}
