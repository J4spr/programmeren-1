package Week9.Laptop;

public class Laptop {
    private String owner;
    private CpuGeneration generation;
    private CpuType type;
    private int ram;
    private int disk;
    private Brand brand;

    public Laptop(String owner, CpuGeneration generation, CpuType type, int ram, int disk, Brand brand) {
        this.owner = owner;
        this.generation = generation;
        this.type = type;
        this.ram = ram;
        this.disk = disk;
        this.brand = brand;
    }

    public String getOwner() {
        return this.owner;
    }

    public CpuGeneration getGeneration() {
        return this.generation;
    }

    public CpuType getType() {
        return this.type;
    }

    public int getRam() {
        return this.ram;
    }

    public int getDisk() {
        return this.disk;
    }

    public Brand getBrand() {
        return this.brand;
    }

    @Override
    public String toString() {
        return String.format("Laptop van %s: %s (%s %s) %d GB %d GB", this.owner, this.brand, this.type, this.generation, this.ram, this.disk);
    }
}
