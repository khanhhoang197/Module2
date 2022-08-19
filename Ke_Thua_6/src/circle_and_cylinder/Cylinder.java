package circle_and_cylinder;

public class Cylinder extends Circle{
    private double hight = 1.0;
    public Cylinder(){

    }
    public Cylinder(double hight){
        this.hight = hight;
    }
    public Cylinder(double hight, double radius, String color){
        super(radius, color);
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }
    public double getVolumetric() {
        return getArea() * hight;
    }

    @Override
    public String toString() {
        return "A Cylinder with hight = "
                + getHight()
                + ", Radius = "
                + getRadius()
                + " and color: "
                + getColor();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(15,10,"Yellow");
        System.out.println(cylinder);
    }
}
