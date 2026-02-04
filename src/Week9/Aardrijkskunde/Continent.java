package Week9.Aardrijkskunde;

public enum Continent {
    NORTH_AMERICA(24256000, 470),
    SOUTH_AMERICA(17819000, 331),
    EUROPE(10530750, 728),
    ASIA(44579000, 3604),
    AUSTRALIA(30665000, 654.5),
    ANTARTCICA(13209000, 0);

    private long area;
    private double population;

    private Continent(long area, double population) {
        this.area = area;
        this.population = population;
    }

    public double populationDensity() {
        return this.population / this.area;
    }

    @Override
    public String toString() {
        return String.format("%s pop.density: %.2f", this.name().toLowerCase().replace('_', ' '), this.populationDensity());
    }
}
