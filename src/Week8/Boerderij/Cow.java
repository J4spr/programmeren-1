package Week8.Boerderij;

public class Cow extends FarmAnimal {
    private double literMilkPerDay;

    public Cow(String name, double literMilkPerDay) {
        super(name, "BoeBoe", "Gras");
        this.literMilkPerDay = literMilkPerDay;
    }

    public double getLiterMilkPerDay() {
        return this.literMilkPerDay;
    }

    @Override
    public String toString() {
        return String.format("%s en geeft %.2f liter per dag", super.toString(), this.literMilkPerDay);
    }
}


