package bai6_kt_nam_nhuan;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào năm để kiểm tra có phải năm nhuận hay không: ");
        short year = scanner.nextShort();
        boolean isLeapYear = false;

        boolean isDivisibleBy4 = year % 4 == 0;
        boolean isDivisibleBy100 = year % 100 == 0;
        boolean isDivisibleBy400 = year % 400 == 0;
        if (isDivisibleBy4) {
            if (isDivisibleBy100) {
                if (isDivisibleBy400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.printf("Năm %d là năm nhuận.", year);
        } else {
            System.out.printf("Năm %d không phải là năm nhuận.", year);
        }
    }
}
