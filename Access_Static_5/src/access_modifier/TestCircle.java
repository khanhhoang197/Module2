package access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle cr = new Circle();
        System.out.print("Bán kinh: " + cr.getRadius() + "\nDiện tich: " +  cr.getArea());
        Circle cr1 = new Circle(5);
        System.out.println("\nBán kinh: " + cr1.getRadius() + "\nDiện tích" + cr1.getArea() );
    }
}
