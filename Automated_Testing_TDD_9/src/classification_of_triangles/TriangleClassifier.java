package classification_of_triangles;

import java.util.Scanner;

public class TriangleClassifier {
    public static boolean checkTriangle(int edge1, int edge2, int edge3) {
        boolean isTriangle;
        isTriangle = edge1 > 0
                && edge2 > 0
                && edge3 > 0
                && (edge2 + edge3) > edge1
                && (edge1 + edge3) > edge2
                && (edge1 + edge2) > edge3;
        return isTriangle;
    }

    public static boolean checkRightTriangle(int edge1, int edge2, int edge3) {
        boolean isRightTriangle;
        isRightTriangle = edge2 * edge2 + edge3 * edge3 == edge1 * edge1
                || edge1 * edge1 + edge3 * edge3 == edge2 * edge2
                || edge1 * edge1 + edge2 * edge2 == edge3 * edge3;
        return isRightTriangle;
    }

    public static boolean checkIsoscelesTriangle(int edge1, int edge2, int edge3) {
        boolean isIsoscelesTriangle;
        isIsoscelesTriangle = edge1 == edge2 || edge2 == edge3 || edge1 == edge3;
        return isIsoscelesTriangle;
    }

    public static boolean checkEquilateralTriangle(int edge1, int edge2, int edge3) {
        boolean isEquilateralTriangle;
        isEquilateralTriangle = edge1 == edge2 && edge2 == edge3;
        return isEquilateralTriangle;
    }

    public static String triangleClassifier(int edge1, int edge2, int edge3) {
        String triangleClassifier;
        if (checkTriangle(edge1, edge2, edge3)) {
            if (checkRightTriangle(edge1, edge2, edge3)) {
                triangleClassifier = "Tam Giác Vuông";
            } else if (checkIsoscelesTriangle(edge1, edge2, edge3)) {
                triangleClassifier = "Tam Giác Cân";
            } else if (checkEquilateralTriangle(edge1, edge2, edge3)) {
                triangleClassifier = "Tam Giác Đều";
            } else triangleClassifier = "Tam Giác Thường";
        } else triangleClassifier = "Không Phải Là Tam Giác";
        return triangleClassifier;
    }

    public static void main(String[] args) {
        int edge1,edge2,edge3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của 3 cạnh");
        do {
            System.out.print("Nhập cạnh 1: ");
            edge1 = scanner.nextInt();
        }while (edge1 <= 0);
        do {
            System.out.print("Nhập cạnh 2: ");
            edge2 = scanner.nextInt();
        }while (edge2 <= 0);
        do {
            System.out.print("Nhập cạnh 3: ");
            edge3 = scanner.nextInt();
        }while (edge3 <= 0);
        String result = triangleClassifier(edge1,edge2,edge3);
        System.out.printf("\n Kết quả: %s",result);
    }

}
