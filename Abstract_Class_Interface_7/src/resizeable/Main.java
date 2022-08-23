package resizeable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        Circle circle = new Circle(12);
        System.out.println(circle);
        Rectangle rectangle = new Rectangle(6.5, 8);
        System.out.println(rectangle);
        Aquare aquare = new Aquare("red", true, 4.3);
        System.out.println(aquare);
        double percent = Math.floor(Math.random() * (100 - 1) + 1);
        circle.resize(percent);
        shapes[0] = circle;
        rectangle.resize(percent);
        shapes[1] = rectangle;
        aquare.resize(percent);
        shapes[2] = aquare;
        System.out.println("Array after resizing : " + Arrays.toString(shapes));
    }
}
