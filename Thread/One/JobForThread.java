package Thread.One;

public class JobForThread implements Runnable {
    public void run() {
        for (int i = 0; i < 20; i++) {
            // int a = 10, b = 20;
            System.out.println(Thread.currentThread().getName()+":"+i);
            // a++; b++;
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Make a method to stop a certain thread
            // if (i == 10) {
            //     Thread.currentThread().stop();
            // }
        }
    }
}