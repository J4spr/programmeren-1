package Week8.Printer;

public class Sphere extends PrimitiveObject {
    double radius;

    public Sphere(int x, int y, int z, int radius) {
        super(x, y, z);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }


    protected double volume() {
        return ((double) 4 / 3) * Math.PI * Math.pow(this.radius, 3);
    }

    @Override
    public String toString() {
        return String.format("Bol met straal %.2f op plaats %s en volume %.2f",this.getRadius(), super.toString(), this.volume());
    }
}
