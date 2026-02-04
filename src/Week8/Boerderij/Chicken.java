package Week8.Boerderij;

public class Chicken extends FarmAnimal{
    String name;
    int eggsPerWeek;

    public Chicken(String name, int eggsPerWeek) {
        super(name, "TokTok", "Mais");
        this.name = name;
        this.eggsPerWeek = eggsPerWeek;
    }

    @Override
    public String toString() {
        return String.format("%s en legt %d eieren", super.toString(), this.eggsPerWeek);
    }
}
