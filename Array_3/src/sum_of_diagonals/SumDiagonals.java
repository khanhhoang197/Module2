package sum_of_diagonals;

import java.util.Scanner;

public class SumDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int n;  // bậc của ma trận vuông
            int sum = 0;
            System.out.println("Nhập vào bậc của ma trận: ");
            n = scanner.nextInt();
            int[][] A = new int[n][n];
            System.out.println("Nhập các phần tử cho ma trận: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("A[" + i + "]["+ j + "] = ");
                    A[i][j] = scanner.nextInt();
                }
            }
            System.out.println("Ma trận A vừa nhập:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(A[i][j] + "\t");
                }
                System.out.println("\n");
            }
            // các phần tử nằm trên đường chéo chính
            // là các phần tử có chỉ số dòng = chỉ số cột
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    // kiểm tra nếu i == j thì mới tính tổng
                    if (i == j) {
                        sum += A[i][j];
                    }
                }
            }

            System.out.println("Tổng các phần tử nằm trên đường chéo chính = " + sum);
    }
}
