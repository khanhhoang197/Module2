package simple_thread;

public class NumberGenerator implements Runnable {
    String name;

    public NumberGenerator(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.printf("Generator %s printing the count %d\n",name,i);
                System.out.println("HashCode: " + hashCode());
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e){
            System.out.println("Thread is interrupted\n");
        }
        System.out.printf("\nGenerator %s run is over",name);
    }

}
