package Thread.idk;

public class TestThread {
    public static void main(String[] args) {
        // MyThread myThread1 = new MyThread(); // Create a new instance of MyThread
        // MyThread myThread2 = new MyThread(); // Create another instance of MyThread
        
        // Thread t1 = new Thread(myThread1); // Wrap the first instance in a Thread
        // Thread t2 = new Thread(myThread2); // Wrap the second instance in a Thread

        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());

        // Thread t1 = new MyThread();
        // Thread t2 = new MyThread();
        
        t1.start(); // Start the first thread
        t2.start(); // Start the second thread
    }
}