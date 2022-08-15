package insertion_sort_by_step;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter list size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.printf("Enter %d value: ", arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("your input list: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("\nBegin sort processing...");
        InsertionSortBysStep(arr);
    }
    public static void InsertionSortBysStep(int arr[]) {
        for (int i = 1; i < arr.length; ++i) {
            int k = arr[i];
            int j;
            for(j = i - 1; j < arr.length - k && arr[i] > k; j--){
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = k;
            System.out.print("List after the  " + i + "' sort: ");
            for(j = i - 1; j < arr.length - k && arr[i] > k; j--){
                System.out.print(arr[j] + "\t");
            }
        }
    }
}
