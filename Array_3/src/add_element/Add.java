package add_element;

import java.util.Arrays;
import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 10; // Suc chua cua mang
        int[] array = new int[size];
        array[0] = 8;
        array[1] = -1;
        array[2] = 5;
        array[3] = 2;
        array[4] = 9;
        System.out.print("Mảng ban đầu :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.print("\nNhập phần tử cần chèn vào mảng: ");
        int element = scanner.nextInt();

        System.out.print("\nNhập vị trí cần chèn vào mảng: ");
        int index = scanner.nextInt();

        if (index <= -1 && index >= array.length - 1) {

            System.out.println("Khong ton tai vi tri nay");
        }
        else {
            for (int i = index; i < array.length - 1; i++) {
                array[i + 1] = array[i];
            }
            array[index] = element;
        }
        System.out.println(Arrays.toString(array));

    }
}
