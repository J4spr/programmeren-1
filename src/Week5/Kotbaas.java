package Week5;

public class Kotbaas {
    public static void main(String[] args) {
        Room room1 = new Room(1, 347.0);
        Room room2 = new Room(2, 431.0);
        Room room3 = new Room(3, 285.0);
        Room room4 = new Room(4, 354.0);

        room2.setStudent(new Student("Halfhide Aleksey", "Stationstraat 42", "Gent", 9000));
        room3.setStudent(new Student("Mutambay Lotte", "Boomforeeststraat 12", "Antwerpen", 2000));
        room4.setStudent(new Student("Domen Tim", "Zonnebloemstraat 7", "Brussel", 1000));
        System.out.println(room1);
        System.out.println(room2);
        System.out.println(room3);
        System.out.println(room4);
    }
}

class Room {
    private int roomNumber;
    private Student student;
    private double pricePerMonth;

    public Room(int roomNumber, String student, double pricePerMonth) {
        this.roomNumber = roomNumber;
        this.student = null;
        this.pricePerMonth = pricePerMonth;
    }

    public Room(int roomNumber, double pricePerMonth) {
        this(roomNumber, "", pricePerMonth);
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public Student getStudent() {
        return this.student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public double getPricePerMonth() {
        return this.pricePerMonth;
    }

    public void setPricePerMonth(double pricePerMonth) {
        this.pricePerMonth = pricePerMonth;
    }

    @Override
    public String toString() {
        String student = (this.student != null)? this.student.toString():"leegstaand";
        return String.format("%s (%.2f euro)\n", student, this.pricePerMonth);
    }
}

class Student {
    private String name;
    private String streetNr;
    private String city;
    private int postalCode;

    public Student(String name, String streetNr, String city, int postalCode) {
        this.name = name;
        this.streetNr = streetNr;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getName() {
        return this.name;
    }

    public String getStreetNr() {
        return this.streetNr;
    }

    public String getCity() {
        return this.city;
    }

    public int getPostalCode() {
        return this.postalCode;
    }

    @Override
    public String toString() {
        return this.name +", "+ this.streetNr + ", " + this.postalCode + " " +this.city;
    }
}



