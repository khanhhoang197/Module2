package colorable;

public class Rectangle extends Shape implements Colorable{
    private double width, height;
    public Rectangle(){

    }
    public Rectangle(double width, double height, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double getArea(){
        return width * height;
    }
    @Override
    public double getPerimeter(){
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{ " +
                "width = "
                + getWidth() +
                ", height = "
                + getHeight() +
                '}';
    }

    @Override
    public void howToColor() {
        setColor("red");
    }
}
