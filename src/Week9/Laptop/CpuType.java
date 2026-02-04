package Week9.Laptop;

public enum CpuType {
    I3, I5, I7;

    @Override
    public String toString() {
        return String.format("%s", this.name().toLowerCase());
    }
}
