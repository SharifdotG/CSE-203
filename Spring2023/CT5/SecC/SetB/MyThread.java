package Spring2023.CT5.SecC.SetB;

public class MyThread extends Thread {
    private String data;
    private int n;
    
    public MyThread(String data, int n) {
        this.data = data;
        this.n = n;
    }
    
    @Override
    public void run() {
        if (n % 2 != 0) {
            for (int i = 0; i < n; i++) {
                System.out.println(data);
            }
        } else {
            for (int i = 0; i < n / 2; i++) {
                System.out.println(data);
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new MyThread("OOP", 10);
        Thread thread2 = new MyThread("DataStructure", 33);
        Thread thread3 = new MyThread("Math", 100);
    
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
