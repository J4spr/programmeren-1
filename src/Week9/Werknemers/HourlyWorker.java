package Week9.Werknemers;

public class HourlyWorker extends Employee {
    private final int MAX_HOURS_PER_WEEK = 38;
    private int hours;

    public HourlyWorker(String name, long nationalNumber, int hours) {
        super(name, nationalNumber);
        this.hours = hours;
    }


    @Override
    public double getWages() {
        double regularHours = this.hours;
        double overtimeHours = 0;

        if (this.hours > this.MAX_HOURS_PER_WEEK) {
            regularHours = this.MAX_HOURS_PER_WEEK;
            overtimeHours = this.hours - this.MAX_HOURS_PER_WEEK;
        }

        return (regularHours * super.HOURLY_WAGES) +
                (overtimeHours * super.HOURLY_WAGES * 1.5);
    }

    public void setHours(int hours) {
        this.hours = hours;
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
