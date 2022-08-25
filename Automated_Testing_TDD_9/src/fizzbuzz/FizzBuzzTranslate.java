package fizzbuzz;

import java.util.Scanner;

public class FizzBuzzTranslate {
    public static String readNumbersIntoWords(int number) {
        String words;
        boolean isMod3 = number % 3 == 0;
        boolean isMod5 = number % 5 == 0;
        boolean isHave3 = number / 10 == 3 && number % 10 == 3;
        boolean isHave5 = number / 10 == 5 && number % 10 == 5;
        boolean isMod3And5 = isMod3 && isMod5;
        if (isMod3And5)
            return words = "FizzBuzz";
        if (isMod3 && isHave3)
            return words = "Fizz";
        if (isMod5 && isHave5)
            return words = "Buzz";
        else
            return words = readNumberIntoWordsNotFizzBuzz(number);
    }
    public static String readZeroToNine(int number) {
        String words = "";
        switch (number){
            case 0:
                words = "Zero";
                break;
            case 1:
                words = "One";
                break;
            case 2:
                words = "Two";
                break;
            case 3:
                words = "Fizz";
                break;
            case 4:
                words = "For";
                break;
            case 5:
                words = "Buzz";
                break;
            case 6:
                words = "Six";
                break;
            case 7:
                words = "Seven";
                break;
            case 8:
                words = "Eight";
                break;
            case 9:
                words = "Nine";
        }
        return words;
    }
    public static String readNumberIntoWordsNotFizzBuzz(int number) {
        String words = "";
        int first = number / 10;
        int second = number % 10;
        if (number < 10)
            words = readZeroToNine(second);
        else if (number < 100)
            words = readZeroToNine(first) + " " + readZeroToNine(second);
        return words;
    }

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập số: ");
            number = sc.nextInt();
        } while (number < 0 || number > 99);
        System.out.println(readNumbersIntoWords(number));
    }

}
