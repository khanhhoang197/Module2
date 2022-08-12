package find_element_in_array;

public class FindElement {
    public static void main(String[] args) {
        int[] numberArr = {1, 10, 30, 2, 71, 7, 9, 51, 3, 5};
        int max = numberArr[0];
        System.out.println("Các phần tử trong mảng là: ");
        for (int i : numberArr) {
            System.out.print(i + ", ");
        }
        for (int num : numberArr) {
            if (max < num)
                max = num;
        }
        System.out.printf("\nSố lớn nhất trong mảng là: %d\n", max);
        printPrime();
    }

    public static void printPrime() {
        int[] numberArr = {1, 10, 30, 2, 71, 7, 9, 51, 3, 5};
        System.out.print("Danh sách các số nguyên tố trong mảng là: ");
        for (int number : numberArr) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
//        for (int i : numberArr) {
//            boolean check = true;
//            if (i >= 2) {
//                int number;
//                for (int j = 2; j < i; j++) {
//                    if (i % j == 0) {
//                        check = false;
//                        break;
//                    }
//                }
//                if (check) {
//                    System.out.print(i + " ");
//                }
//            }
//        }
    }

    private static boolean isPrime(int number) {
        if (number < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i += 1) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}





