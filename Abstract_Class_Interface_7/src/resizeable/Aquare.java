package resizeable;

public class Aquare extends Shape {
    private double length;

    public Aquare() {

    }

    public Aquare(String color, boolean filled, double length) {
        super(color, filled);
        this.length = length;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        this.setColor(color);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public String toString() {
        return "Aquare length = " + getLength()
                + " Area square " + getArea()
                + super.toString();
    }

    @Override
    public void resize(double x) {
        this.length = Math.floor(Math.random() * (100 - 1) + 1);

    }
}
