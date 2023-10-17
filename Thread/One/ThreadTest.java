package Thread.One;

public class ThreadTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new JobForThread(), "1st thread");
        Thread t2 = new Thread(new JobForThread(), "2nd thread");

        t1.start();
        t2.start();
        
        System.out.println("Main completed");
    }
}