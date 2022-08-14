package sum_number_in_colum;

import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int row = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        int colum = scanner.nextInt();
        int[][] array = new int[row][colum];

        System.out.println("mảng khởi tạo: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) Math.floor(Math.random() * (10 - 2 + 1) + 2);
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
        // tính tổng các số ở đường chéo chính
        System.out.print("nhập cô muốn tính tổng: ");
        int sumcolum = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == sumcolum - 1) {
                    sum += array[i][j];
                }
            }
        }
        System.out.printf("Tổng của các số ở cột thứ %d là %d: ",sumcolum, sum);
    }
}
