package quadratic_equation;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("QuadraticEquation ax2 + bx + x = 0");
        System.out.println("Enter a,b,c: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        if (qe.getDiscriminant() < 0) System.out.println("The equation has no roots");
        else if (qe.getDiscriminant() == 0) System.out.println("The equation has one root: " + qe.getRoot1());
        else {
            System.out.println("The equation has two roots: ");
            System.out.println("Delta is: " + qe.getDiscriminant());
            System.out.println("Root1 is: " + qe.getRoot1());
            System.out.println("Root2 is: " + qe.getRoot2());
        }
    }
}
