package demo;

public class Demo {

    public void getInformation() {
        System.out.print("has 2 legs, can fly");
    }

    public class CParrot extends Demo {

        public void getInformation() {
            System.out.println("Parrot");

            super.getInformation();
        }
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.getInformation();
    }
}
