package remove_element;

import java.util.Scanner;

public class Remove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {8, 5, 2, 9, 6, 3, 7, 4, 1};
        int c = 0, i;
        System.out.print("Nhập số mốn xóa: ");
        int k = scanner.nextInt();
        for (i = 0; i < array.length; i++) {
            if (array[i] != k) {
                array[c] = array[i];
                c++;
            }
        }
        System.out.printf("\nMảng còn lại sau khi xóa phần tử %d là: ",k);
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
