package find_min_element;

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Nhập kích thước mảng: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Kích thước quá lớn, mời nhập lại: ");
        }while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.printf("Nhập vào phần tử thứ %d: ",i);
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Mảng: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        int min = array[0];
        for (int k = 0 ; k < array.length; k++){
            if (min > array[k]) {
                min = array[k];
            }
        }
        System.out.printf("\nGiá trị nhỏ nhất trong mảng là: %d",min);
    }
}
