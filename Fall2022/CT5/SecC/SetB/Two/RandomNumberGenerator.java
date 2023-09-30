package Fall2022.CT5.SecC.SetB.Two;

import java.util.Random; //

/*
 * RandomNumberGenerator implements Runnable to generate 10 random numbers
 */
public class RandomNumberGenerator implements Runnable {
    /*
     * Constants for the number of random numbers to generate
     * and the maximum random number to generate (inclusive)
     */
    private static final int NUM_RANDOM_NUMBERS = 10;
    private static final int MAX_RANDOM_NUMBER = 49;
    private static final Random random = new Random();

    /*
     * Generates 10 random numbers and prints them to the
     * console with the name of the thread that generated them
     */
    @Override
    public void run() {
        for (int i = 0; i < NUM_RANDOM_NUMBERS; i++) {
            int randomNumber = random.nextInt(MAX_RANDOM_NUMBER + 1);
            System.out.println(Thread.currentThread().getName() + ": " + randomNumber);
        }
    }

    public static void main(String[] args) {
        /*
         * Create 3 threads
         */
        Thread thread1 = new Thread(new RandomNumberGenerator(), "Thread 1");
        Thread thread2 = new Thread(new RandomNumberGenerator(), "Thread 2");
        Thread thread3 = new Thread(new RandomNumberGenerator(), "Thread 3");

        /*
         * Start the threads
         */
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

