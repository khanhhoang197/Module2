package getter_setter;

public class MainPerson {
    public static void main(String[] args) {
        Person ps = new Person("Khanh Hoàng", 25,true);
        System.out.print("\nName: " + ps.getName());
        System.out.print("\nAge: " + ps.getAge());
        System.out.print("\nGender: " + ps.isGender());
    }

}
