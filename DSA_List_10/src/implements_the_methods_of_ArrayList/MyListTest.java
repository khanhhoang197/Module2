package implements_the_methods_of_ArrayList;

import java.util.Scanner;

public class MyListTest {
    public static void main(String[] args) {
        int num;
        MyList<Number> list = new MyList<>();
        list.add(0, 1);
        list.add(1, 2);
        list.add(2, 3);
        list.add(3, 4);
        list.add(4, 6);
        list.add(5, 15);
        list.remove(5);
        list.add(2, 20);
        list.add(3, 15);
        list.add(1, 70);
        list.add(0, 8);
        list.add(4, 9);
        System.out.println(list.toString());
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter check number: ");
            num = sc.nextInt();
            if (list.contains(num)) {
                System.out.println(num + " is Yes!");

            }
                if(!list.contains(num)) {
                System.out.println(num + " is NO!");
            }
        } while (true);
    }

}
