package colorable;

public class Square extends Shape implements Colorable {
    private double length;

    public Square() {
    }

    public Square(double length) {
        this.length = length;
    }

    public Square(String color, boolean filled, double length) {
        super(color, filled);
        this.length = length;
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
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public String toString() {
        return "Square " +
                "length = " + getLength() +
                ", color = '" + getColor()
                +
                ", filled = " + isFilled()
                + "Square area : " + getArea()
                + ", Perimeter : " + getPerimeter();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four lengths");
    }
}
