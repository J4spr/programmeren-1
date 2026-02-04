package Week8;

public class Demo {
    public static void main(String[] args) {

    }
}

class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(Rectangle other) {
        this(other.length, other.width);
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


}

//class Square extends Rectangle;

class SquaredRectangle extends Rectangle{
    private int colour;

    public int getColour() {
        return colour;
    }

    public void setColour(int colour) {
        this.colour = colour;
    }
}