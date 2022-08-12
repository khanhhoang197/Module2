package reverse_arr;

import java.util.Scanner;

public class ReveseArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int [] array;
        do {
            System.out.print("Nhập độ dài của mảng: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.printf("Độ dài của mảng không được lớn hơn 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Nhập Ptử " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-30s%s", "Mảng khởi tạo là: ", "");
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + " \t");
        }
        for (int j = 0; j < array.length / 2; j++){
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-30s%s", "Mảng sau khi đảo ngược là: ", "");
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + " \t");
        }
    }
}
