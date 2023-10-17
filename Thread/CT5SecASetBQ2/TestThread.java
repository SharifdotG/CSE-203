package Thread.CT5SecASetBQ2;

public class TestThread {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        t1.setName("First Thread");

        Thread t2 = new MyThread();
        t2.setName("2nd Thread");

        Thread t3 = new MyThread();
        t3.setName("3rd Thread");

        // t1.start();
        // t2.start();
        // t3.start();

        t1.run();
        t2.run();
        t3.run();

        System.out.println("Main completed");
    }
}