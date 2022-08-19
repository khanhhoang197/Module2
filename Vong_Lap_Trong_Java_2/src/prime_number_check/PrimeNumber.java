package prime_number_check;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số muốn kiểm tra: ");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.printf("%d không phải số nguyên tố",number);
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.printf("%d Là số nguyên tố",number);
            else
                System.out.printf("%d không phải số nguyên tố",number);
        }
    }
}
