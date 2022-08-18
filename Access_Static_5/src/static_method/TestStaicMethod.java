package static_method;

public class TestStaicMethod{
    public static void main(String[] args) {
        Students.change();
        Students s1 = new Students(111,"Khanh");
        Students s2 = new Students(222, "Hoang");
        Students s3 = new Students(333,"Nam");

        s1.display();
        s2.display();
        s3.display();
    }

}
