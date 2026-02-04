package Week8.Model;

public class Address {
    private String streetNr;
    private String zipCode;

    public Address(String streetNr, String zipCode) {
        this.streetNr = streetNr;
        this.zipCode = zipCode;
    }
    public Address(){
        this("", "");
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreetNr() {
        return this.streetNr;
    }

    public void setStreetNr(String streetNr) {
        this.streetNr = streetNr;
    }

// TODO add tostring
}
