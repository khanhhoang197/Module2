package demo;

public class MainStatic {
    public static void main(String[] args) {
        // tạo một thể hiện của lớp static
        Static st = new Static();

        // gọi phương thức non-static
        System.out.println(" 2 * 2 = " + st.multiply(2,2));

        // gọi phương thức static
        System.out.println(" 2 + 3 = " + Static.add(2,3));
    }

}
