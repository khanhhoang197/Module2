package triangle_exception;

public class RightTriangle {
    public void checkRightTriangle(double a, double b, double c) throws IllegalTriangleException {
//        if (a < 0 || b < 0 || c < 0) {
//            throw new IllegalRightTriangleException("Loi: Canh tam giac khong hop le");
//        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Loi: Tam giac khong hop le!");
        } else {
            System.out.println("Tam giac hop le!");
        }
    }
}
