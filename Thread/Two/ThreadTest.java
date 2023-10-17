package Thread.Two;

public class ThreadTest extends Thread {
    public static void main(String[] args) {
        Thread t1 = new ThreadTest();
        Thread t2 = new ThreadTest();
        Thread t3 = new ThreadTest();
        Thread t4 = new ThreadTest();

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println("Main completed");
    }

    public void run() {
        for (int i = 0; i<5; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}