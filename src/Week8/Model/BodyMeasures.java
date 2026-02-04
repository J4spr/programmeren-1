package Week8.Model;

public class BodyMeasures {
    private double bust;
    private double hips;
    private double waist;
    Person person;
    public BodyMeasures(String name, double bust, double hips, double waist) {
        this.person = new Person(name);
        this.bust = bust;
        this.hips = hips;
        this.waist = waist;
    }

    public BodyMeasures(String name) {
        this(name, 90.0, 60.0, 90.0);
    }

    public double getWaist() {
        return this.waist;
    }

    public double getHips() {
        return this.hips;
    }

    public double getBust() {
        return this.bust;
    }

    @Override
    public String toString() {
        return String.format("Maten: %s %s %s", this.bust, this.hips, this.waist);
    }
}