package find_maximum;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int [] array;
        do {
            System.out.print("Nhập số lượng danh sách tài sản: ");
            size = scanner.nextInt();
            if(size > 20)
                System.out.println("Danh sách vượt quá 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Nhập vào Ptử: " + (i+1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Danh sách: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " \t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max){
                max = array[j];
                index = j + 1;
            }
        }
        System.out.printf("\nTài sản lớn nhất %d ở vị trí %d", max, index);
    }
}
