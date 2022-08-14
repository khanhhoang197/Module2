package pass_student;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int size;
        do {
            System.out.print("Nhập vào danh sách sinh viên: ");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Danh sách lớn hơn 30, mời nhập lại.");
        } while (size > 30);
        array = new int[size];
        int i = 0;
        while ( i < array.length){
            System.out.printf("Nhập điểm sinh viên thứ %d :",(i+1));
            array[i] = scanner.nextInt();
//            if (array[i] < 0 && array[i] > 10){
//                System.out.print("điểm số không hợp lệ, mời nhập lại.");
//            }
            i++;
        }
        int count = 0;
        System.out.print("Danh sách điểm: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "  ");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.printf("\nSố lượng sinh viên thi đỗ là: %d ", count);
    }
}
