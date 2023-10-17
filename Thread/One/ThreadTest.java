package Thread.One;

public class ThreadTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new JobForThread());
        Thread t2 = new Thread(new JobForThread());
        Thread t3 = new Thread(new JobForThread());

        // t1.start();
        // t2.start();
        // t3.start();

        t1.run();
        t2.run();
        t3.run();
        
        System.out.println("Main completed");
    }
}