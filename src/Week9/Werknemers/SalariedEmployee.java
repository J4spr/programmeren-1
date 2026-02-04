package Week9.Werknemers;

public class SalariedEmployee extends Employee {
    private final int WAGE_FACTOR = 192;
    private double hours;

    public SalariedEmployee(String name, long nationalNumber, double hours) {
        super(name, nationalNumber);
        this.hours = hours;
    }

    @Override
    public double getWages() {
        return (super.HOURLY_WAGES * this.WAGE_FACTOR);
    }


    @Override
    public long getNationalNumber() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%sLoon: %s\n", super.toString(), this.getWages());

    }
}
