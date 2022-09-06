package count_app;

public class Count implements Runnable{
    private Thread myThread;
    public Count(){
        myThread = new Thread(this, "my Runnable Thread");
        System.out.printf("my Thread created %s",myThread);
        myThread.start();
    }
    public Thread getMyThread() {
        return myThread;
    }
    @Override
    public void run(){
        try{
            for (int i = 0; i < 10; i++){
                System.out.printf("\nprinting the count %d \n",i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread run is over");
    }
}
