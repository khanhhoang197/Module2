package decimal_binary;

import java.util.Scanner;
import java.util.Stack;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Object> stack = new Stack<>();
        System.out.print("Nhập số muốn chuyển đổi: ");
        int n = sc.nextInt();
        while (n > 0) {
            int a = n % 2;
            stack.push(a);
            n = n / 2;
        }
        String str = "";
        while (!stack.isEmpty()) {
            str += stack.pop();
        }

        System.out.print(str);
    }
}
