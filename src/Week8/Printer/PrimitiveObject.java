package Week8.Printer;

public class PrimitiveObject {
    protected double[] position = new double[3];



    public PrimitiveObject(double x, double y, double z) {
        this.position[0] = x;
        this.position[1] = y;
        this.position[2] = z;
    }

    public PrimitiveObject() {
        this.position = new double[]{0, 0, 0};
    }

    protected double volume() {
        return 0;
    }

    public double getX() {
        return this.position[0];
    }

    public double getY() {
        return this.position[1];
    }

    public double getZ() {
        return this.position[2];
    }

    @Override
    public String toString() {
        return String.format("(%.2f %.2f %.2f)", this.position[0], this.position[1], this.position[2]);
    }
}
