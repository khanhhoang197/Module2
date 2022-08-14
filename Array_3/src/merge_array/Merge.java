package merge_array;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int [] array1 = {1, 2, 3, 4, 5};
        int [] array2 = {6, 7, 8, 9, 10};
        int size = array1.length + array2.length;
        int [] array3 = new int[size];
        int i = 0;
        for(int element : array1){
            array3[i] = element;
            i++;
        }
        for (int element : array2){
            array3[i] = element;
            i++;
        }
        System.out.printf("Mảng 1: " + Arrays.toString(array1));
        System.out.printf("\nMảng 2: " + Arrays.toString(array2));
        System.out.println("\nMảng sau khi gộp: " + Arrays.toString(array3));
    }
}
