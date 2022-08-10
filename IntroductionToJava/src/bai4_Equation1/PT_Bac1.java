package bai4_Equation1;

import java.util.Scanner;

public class PT_Bac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giải phương trình bậc nhất.");
        System.out.println("Cho một phương trình dạng 'a * x + b = c', vui lòng nhập các số: ");

        System.out.print("Nhập a = ");
        double a = scanner.nextDouble();

        System.out.print("Nhập b = ");
        double b = scanner.nextDouble();

        System.out.print("Nhập c = ");
        double c = scanner.nextDouble();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Phương trình có nghiệm x = %f!\n ", answer);
        }else{
            if (b == c){
                System.out.print("Phương trình có vô số nghiệm");
            }else {
                System.out.print("Phương trình vô nghiệm.");
            }
        }
    }


}
