import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Certificate> arr = new ArrayList<>();
        arr.add(new Certificate("1", "xe may", "a1", "15/5/2019"));
        arr.add(new Certificate("2", "xe oto", "C", "15/5/2019"));

        Employee nv1 = new Experience(1, "Le Ba Loc", "2k2", 345678999,
                "Loc@gmail.com", 1, 50, "chăn nuôi", arr);
        System.out.println(nv1.showInfo());
        System.out.println(nv1.getEmployee_count());
    }
}
