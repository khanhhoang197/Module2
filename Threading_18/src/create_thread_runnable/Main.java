package create_thread_runnable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running...");
        RunnableDemo runnableDemo = new RunnableDemo("Thread-1-HR-Database");
        runnableDemo.start();;

        RunnableDemo runnableDemo1 = new RunnableDemo("Thread-2-Sebd = email");
        RunnableDemo runnableDemo2 = new RunnableDemo("Thread-2-Send-Email");
        runnableDemo2.start();

        System.out.println("Main thread stopped!!! ");
    }
}
