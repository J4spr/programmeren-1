package Week8.Model;

public class Model extends Person {
    private BodyMeasures measures;
    private Address address;

    public Model(String name) {
        super(name);
        this.address = null;
        this.measures = new BodyMeasures(name);

    }
    public Model(String name, double bust, double hips, double waist){
        this.measures = new BodyMeasures(name, bust, hips, waist);
    }

    public void setAddress(String streetNr, String zipCode) {
        this.address = new Address(streetNr, zipCode);
    }

    public String getAddress() {
        return address.toString();
    }

    public void setMeasures(double bust, double hips, double waist) {
        this.measures = new BodyMeasures(this.getName(), bust, hips, waist);
    }


    public double getBust() {
        return measures.getBust();
    }

    public double getWaist() {
        return measures.getWaist();
    }

    public double getHips() {
        return measures.getHips();
    }
}
