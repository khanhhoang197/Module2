package reverse;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {0,2,4,6,8,10};
        System.out.printf("Mảng khởi tạo: %s", Arrays.toString(numbers) );
        reverseArrayInt(numbers);
        System.out.printf("\nMảng sau khi đảo ngược: %s",Arrays.toString(numbers));

        String str = "Hôm nay tôi đi học";
        System.out.printf("\nChuỗi khởi tạo: %s",str);
        str = reverseArrayString(str);
        System.out.printf("\nChuỗi sau khi đảo: %s", str);
    }

    private static String reverseArrayString(String str) {
        Stack<String>stack = new Stack<>();
        for (int i = 0; i< str.length();i++){
            stack.push(str.charAt(i) + "");
        }
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i<str.length();i++)
            newStr.append(stack.pop());
        return newStr.toString();
    }

    private static void reverseArrayInt(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        for (int number : numbers){
            stack.push(number);
        }for (int i = 0; i<numbers.length; i++){
            numbers[i]= stack.pop();
        }
    }
}
