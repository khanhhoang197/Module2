package static_method;

public class Students {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    Students(int r, String n) {
        rollno = r;
        name = n;
    }

    static void change() {
        college = "CODGYM";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
