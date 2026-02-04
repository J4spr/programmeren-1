package Week8.Printer;

public class Cylinder extends PrimitiveObject {
    protected double radius;
    protected double height;

    public Cylinder(int x, int y, int z, int radius, int height) {
        super(x, y, z);
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return String.format("Cylinder met straal %.1f en hoogte %.1fop plaats %s en volume %.2f", this.radius, this.height, super.toString(), this.volume());
    }

    public double volume() {
        return (Math.pow(this.radius, 2) * Math.PI) * this.height;
    }
}
