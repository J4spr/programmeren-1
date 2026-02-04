package Week9.Werknemers;

abstract class Employee {
    protected final double HOURLY_WAGES = 12.5;
    private long nationalNumber;
    private String name;

    public Employee(String name, long nationalNumber) {
        this.name = name;
        this.nationalNumber = nationalNumber;
    }



    public abstract double getWages();

    public abstract long getNationalNumber();


    @Override
    public String toString() {
        return String.format("Naam: %s\nNummer: %.2f\n", this.name, this.getWages());
    }
}
