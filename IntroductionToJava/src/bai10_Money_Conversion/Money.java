package bai10_Money_Conversion;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter USD: ");
        int USD = scanner.nextInt();
        int rate = 23000 * USD;
        System.out.printf("Money change VNĐ: %d VNĐ",rate);

    }
}
