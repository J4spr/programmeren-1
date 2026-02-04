package Week9.Laptop;

public enum CpuGeneration {
    SANDY_BRIDGE, IVY_BRIDGE, HASWELL, BROADWELL, SKYLAKE, KABYLAKE;

    @Override
    public String toString() {
        String name = this.name().toLowerCase().replace('_', ' ');

        String firstLetter = name.substring(0, 1).toUpperCase();
        String restOfString = name.substring(1);

        return firstLetter + restOfString;
    }
}
