package find_minimum;

public class Min {
    public static void main(String[] args) {
        int[] arr = {18, 2, 5, 6, 74, 1, 9, 10, 42};
        int index = minValue(arr);
        System.out.printf("Giá trị nhỏ nhất trong mảng là: %d", arr[index]);
    }

    public static int minValue(int[] array){
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
