package getter_setter;

public class Person {
    private int age;
    private boolean gender;
    private String name;

    public Person(String name, int age, boolean gender) {
        this.name = name;
        setAge(age);
        this.gender = gender;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.print("Age illegal");
            return;
        }
            this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
