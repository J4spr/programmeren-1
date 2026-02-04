package Week9.Demo;

public class Licenseplate implements Comparable {
    private String number;

    public Licenseplate(String number) {
        this.number = number;
    }

    public String getNumber() {
        return this.number;
    }


    @Override
    public boolean isSmallerThan(Comparable other) {
        if (!(other instanceof Licenseplate plate)) {
            return false;
        }
        int c = this.number.compareTo(plate.number);
        return c < 0;
    }

    @Override
    public boolean isGreaterThan(Comparable other) {
        if (!(other instanceof Licenseplate plate)) {
            return false;
        }
        int c = this.number.compareTo(plate.number);
        return c > 0;
    }

    @Override
    public boolean isEqualTo(Comparable other) {
        if (!(other instanceof Licenseplate plate)) {
            return false;
        }
        int c = this.number.compareTo(plate.number);
        return c == 0;
    }
}
