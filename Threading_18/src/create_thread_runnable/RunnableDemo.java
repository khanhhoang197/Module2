package create_thread_runnable;

public class RunnableDemo implements Runnable{
    private Thread t;
    private final String threadName;
    RunnableDemo(String name){
        threadName = name;
        System.out.printf("Creating %s",threadName);
    }
    @Override
    public void run(){
        System.out.printf("Running %s", threadName);
        try {
            for (int i = 4; i>0;i--){
                System.out.printf("Thread: %s, %d",threadName,i);
                Thread.sleep(50);
            }
        }
        catch (InterruptedException e){
            System.out.printf("Thread: %s interrupted",threadName);
        }
        System.out.printf("Thread %s exiting.\n",threadName);
    }
    public void start(){
        System.out.printf("Starting %s",threadName);
        if (t==null){
            t = new Thread(this,threadName);
            t.start();
        }
    }
}
