package Fall2022.CT5.SecD.SetA.Two;

/*
 * EvenNumberSumThread class calculates the sum of first 10 even numbers using 3 threads.
 */
class EvenNumberSumThread extends Thread {
    private int threadNumber;

    /*
     * Constructor to initialize the thread number.
     */
    public EvenNumberSumThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    /*
     * Run method to calculate the sum of first 10 even numbers.
     */
    @Override
    public void run() {
        int sum = 0; // Initialize the sum
        int count = 0; // Initialize the count
        int number = 1; // Initialize the number

        /*
         * Loop to calculate the sum of first 10 even numbers.
         */
        while (count < 10) {
            if (number % 2 == 0) {
                sum += number;
                count++; // Increment the count
            }
            number++; // Increment the number
        }

        /*
         * Print the sum of first 10 even numbers.
         */
        System.out.println("Thread " + threadNumber + ": Sum of first 10 even numbers is " + sum);
    }
}
/*
 * Main class to create three threads and start them.
 */
public class Main {
    public static void main(String[] args) {
        /*
         * Create three threads.
         */
        EvenNumberSumThread thread1 = new EvenNumberSumThread(1);
        EvenNumberSumThread thread2 = new EvenNumberSumThread(2);
        EvenNumberSumThread thread3 = new EvenNumberSumThread(3);

        /*
         * Start the threads.
         */
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
