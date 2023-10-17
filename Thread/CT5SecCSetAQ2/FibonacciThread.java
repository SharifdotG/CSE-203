package Thread.CT5SecCSetAQ2;

public class FibonacciThread extends Thread {
    private int n;

    public FibonacciThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        int a = 0, b = 1, c = 0;
        System.out.println("Fibonacci series upto " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        FibonacciThread thread1 = new FibonacciThread(10);
        FibonacciThread thread2 = new FibonacciThread(10);
        FibonacciThread thread3 = new FibonacciThread(10);

        thread1.start();
        thread2.start();
        thread3.start();
    }
    
}
