package even_odd_numbers;

public class EvenThread implements Runnable {
    String name;

    public EvenThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 2; i <= 10; i += 2) {
                System.out.printf("\n%s Number %d",name,i);
                Thread.sleep(15);
            }
        }
        catch (InterruptedException e){
            throw new RuntimeException();
        }
    }
}
