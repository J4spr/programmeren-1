package Week9.TransportMiddelen;

abstract class MeansOfTransport {
    private double speed;

    public MeansOfTransport(double speed) {
        this.speed = speed;
    }

    public abstract String travelDistance(double distance);


}
