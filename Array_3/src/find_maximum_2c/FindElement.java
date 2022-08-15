package find_maximum_2c;


import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng ngang: ");
        int x = sc.nextInt();
        System.out.print("\nNhập số côt: ");
        int y = sc.nextInt();
        int[][] array = new int[x][y];
        System.out.print("\nNhập số nhỏ nhất: ");
        int rd1 = sc.nextInt();
        System.out.print("\nNhập sô lớn nhất): ");
        int rd2 = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * (rd2 - rd1 + 1) + rd1);
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
        int max = array[0][0];
        for (int i = 0; i < array.length;i++) {
            for (int j = 0; j < array[i].length;j++){
                if(array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất là : " + max);
    }
}
