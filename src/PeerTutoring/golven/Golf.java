package PeerTutoring.golven;

public class Golf {
    double amp;
    double freq;
    double phase;

    public Golf(double amp, double freq, double phase) {
        this.amp = amp;
        this.freq = freq;
        this.phase = phase;
    }

    public Golf() {
        this(0.0, 0.0, 0.0);
    }

    public void setAmp(double amp) {
        this.amp = amp;
    }

    public void setPhase(double phase) {
        if (phase < 0)
            this.phase = 0;
        else
            this.phase = phase;
    }

    public void setFreq(double freq) {
        if (freq < 0)
            this.freq = 0;
        else
            this.freq = freq;
    }

    public double getYWaarde(double x) {
        return this.amp * Math.sin(this.freq * x + phase);
    }

}
