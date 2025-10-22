package Week5;

public class VerhuisFirma {
    public static void main(String[] args) {
        Box box = new Box("Type4", 100, 20, 30);
        System.out.println(box);
        box = new Box("Type1");
        System.out.println(box);
        box = new Box("onbekend type");
        System.out.println(box);
    }
}

class Box {
    private String type;
    private double lenght;
    private double width;
    private double height;

    public Box(String type, int lenght, int width, int height) {
        this.type = type;
        this.lenght = lenght;
        this.width = width;
        this.height = height;
    }

    public Box(String type) {
        this(type, 0, 0, 0);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double groundArea() {
        return this.lenght * this.width;
    }

    public double getVolume() {
        return this.lenght * this.width * this.height;
    }

    public double tapeLength() {
        return (this.lenght + this.width) * 2;
    }

    public String toString() {
        return String.format("Deze box van het type %s heeft een hoogte van %.2f, een lengte van %.2f en een breedte van %.2f", this.type, this.height, this.lenght, this.width);
    }


}
