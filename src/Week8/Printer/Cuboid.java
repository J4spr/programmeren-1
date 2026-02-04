package Week8.Printer;

public class Cuboid extends PrimitiveObject {
    int width;
    int height;
    int depth;
    private double[] size = new double[3];

    public Cuboid(int x, int y, int z, int width, int height, int depth) {
        super(x, y, z);
        this.size[0] = super.getX();
        this.size[1] = super.getY();
        this.size[2] = super.getZ();
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getWidth() {
        return super.getX();
    }

    public double getHeight() {
        return super.getY();
    }

    public double getDepth() {
        return super.getZ();
    }

    @Override
    public String toString() {
        return String.format("Balk met admetingen %s en volume %.2f", super.toString(), this.volume());
    }
}
