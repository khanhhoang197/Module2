package even_odd_numbers;

public class OddThread implements Runnable {
    String name;

    public OddThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i += 2) {
                System.out.printf("\n%s Number %d",name,i);
                Thread.sleep(10);
            }
        }
        catch (InterruptedException e){
            throw new RuntimeException();
        }
    }
}
