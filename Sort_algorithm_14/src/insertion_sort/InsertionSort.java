package insertion_sort;

public class InsertionSort {
    static int[] arr = {5, 2, 7, 3, 6, 9, 12};
    public static void InsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; ++i) {
            int k = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > k) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = k;
        }
    }
    public static void main(String[] args) {
        InsertionSort(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
