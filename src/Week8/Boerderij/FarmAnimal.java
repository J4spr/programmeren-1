package Week8.Boerderij;

public class FarmAnimal {
    private String name;
    protected String sound;
    private String food;

    public FarmAnimal(String name, String sound, String food) {
        this.name = name;
        this. sound = sound;
        this.food = food;
    }

    public String getName() {
        return this.name;
    }

    public String getFood() {
        return this.food;
    }

    public String getSound() {
        return this.sound;
    }

    @Override
    public String toString() {
        return String.format("%s maakt geluid \"%s\" en eet %s", this.name, this.sound, this.food);
    }
}
