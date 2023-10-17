package Fall2022.CT5.SecC.SetA.Two;

/*
 * FibonacciThread class is used to print the Fibonacci series using 3 threads.
 */
public class FibonacciThread extends Thread {
    private int n; // Thread number

    /*
     * Constructor to initialize the thread number.
     */
    public FibonacciThread(int n) {
        this.n = n; // Initialize the thread number
    }

    /*
     * run() method is used to print the Fibonacci series.
     */
    @Override
    public void run() {
        int prev = 0; // Previous number
        int current = 1; // Current number
        
        System.out.print("Fibonacci Series (Thread " + n + "): "); // Print the thread number
        
        /*
         * Print the Fibonacci series.
         */
        for (int i = 0; i < 10; i++) {
            System.out.println(prev); // Print the previous number
            int next = prev + current; // Calculate the next number
            prev = current; // Update the previous number
            current = next; // Update the current number
        }
        
        System.out.println();
    }

    /*
     * main() method is used to test the FibonacciThread class.
     */
    public static void main(String[] args) {
        /*
         * Create 3 threads.
         */
        FibonacciThread thread1 = new FibonacciThread(1);
        FibonacciThread thread2 = new FibonacciThread(2);
        FibonacciThread thread3 = new FibonacciThread(3);
        
        /*
         * Start the threads.
         */
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
