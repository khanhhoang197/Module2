package demoFruit;
public abstract class Fruit {
    public boolean certificated;

    public Fruit(boolean certificated) {
        this.certificated = certificated;
    }

    public boolean isCertificated() {
        return certificated;
    }
}
