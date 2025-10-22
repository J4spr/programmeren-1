package Week5;

public class Tekenmachine {
}

class Rectangle {
    private final int CYAN = 0;
    private final int MAGENTA = 1;
    private final int YELLOW = 3;
    private double width;
    private double height;
    private int color;

    public Rectangle(double width, double height, int color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double area() {
        return this.width * this.height;
    }


}
