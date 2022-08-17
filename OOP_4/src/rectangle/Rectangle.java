package rectangle;

import java.util.Scanner;

public class Rectangle {
    double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        if (width < 0 || height < 0) {
            System.out.print("Width or height illegal\n");
            return;
        }
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "Width= " + width + " Height= " + height + "}";
    }
}
