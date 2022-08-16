package bubble_sort_by_step;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.printf("Enter %d value: ", list.length);
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "  ");
        }
        System.out.println("\nBegin sort processing...");
        bubbleSortByStep(list);
    }
//    public static void bubbleSortByStep(int[] list) {
//        boolean needNextPass = true;
//        for (int i = 0; i < list.length && needNextPass; i++) {
//            needNextPass = false;
//            for (int j = 0; j < list.length - i; j++) {
//                if (list[j] > list[j + 1]) {
//                    System.out.printf("Swap %d with %d ", list[j], list[j + 1]);
//                    int temp = list[j];
//                    list[j] = list[j + 1];
//                    list[j + 1] = temp;
//                    needNextPass = true;
//                }
//            }
//            if (needNextPass == false) {
//                System.out.print("Array may be sorted and next pass not needed");
//                break;
//            }
//            System.out.printf("list apter the %d sort: ", i);
//            for (int j = 0; j < list.length; j++) {
//                System.out.print(list[j] + "  ");
//            }
//            System.out.println();
//        }
//
//    }
public static void bubbleSortByStep(int[] list) {
    boolean needNextPass = true;
    for (int k = 1; k < list.length && needNextPass; k++) {
        needNextPass = false;
        for (int i = 0; i < list.length - k; i++) {
            if (list[i] > list[i + 1]) {
                System.out.print("Swap " + list[i] + " with " + list[i + 1]);
                int temp = list[i];
                list[i] = list[i + 1];
                list[i + 1] = temp;

                needNextPass = true;
            }
        }
        if (needNextPass == false) {
            System.out.println("Array may be sorted and next pass not needed");
            break;
        }
        System.out.print("List after the  " + k + "' sort: ");
        for (int j = 0; j < list.length; j++) {
            System.out.print(list[j] + "\t");
        }
        System.out.println();
    }
}
}
