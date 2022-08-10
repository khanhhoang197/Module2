package bai3_Use_Operator;
import java.util.Scanner;
public class Shcn {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float width;
        float leng;
        float S;

        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        width = scanner.nextFloat();

        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        leng = scanner.nextFloat();

        S = width * leng;

        System.out.print("Diện tích hình chữ nhật là: " + S);
    }
}
