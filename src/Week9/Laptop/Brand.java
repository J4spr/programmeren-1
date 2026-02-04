package Week9.Laptop;

public enum Brand {
    ACER, APPLE, ASUS, DELL, HP, LENOVO, MEDION, TOSHIBA;

    @Override
    public String toString() {
        String name = this.name().toLowerCase();
        String firstLetter = name.substring(0, 1).toUpperCase();
        String restOfString = name.substring(1);

        return firstLetter + restOfString;
    }
}
