package bai7_tinh_chi_so_can_nang;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chiều cao (mét): ");
        double height = scanner.nextDouble();

        System.out.print("Nhập vào cân nặng (Kilogam): ");
        double weight = scanner.nextDouble();

        double BMI = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "Chỉ số BMI", "Interpretation\n");

        if (BMI < 18.5)
            System.out.printf("%-20.2f%s", BMI, "Underweight");
        else if (BMI < 25)
            System.out.printf("%-20.2f%s", BMI, "Normal");
        else if (BMI < 30)
            System.out.printf("%-20.2f%s", BMI, "Overweight");
        else
            System.out.printf("%-20.2f%s",BMI, "Obese");
    }
}
