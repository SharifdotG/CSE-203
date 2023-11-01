package Fall2022.Final.Six.AOr;

import java.util.ArrayList;
import java.util.List;

public class EvenNumberThread {
    public static void main(String[] args) {
        List<Integer> evenNumbers = new ArrayList<>();

        // Create 4 threads and specify the ranges for each thread
        Thread thread1 = new Thread(new EvenNumberGenerator(evenNumbers, 20, 30));
        Thread thread2 = new Thread(new EvenNumberGenerator(evenNumbers, 40, 50));
        Thread thread3 = new Thread(new EvenNumberGenerator(evenNumbers, 60, 70));
        Thread thread4 = new Thread(new EvenNumberGenerator(evenNumbers, 80, 90));

        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            // Wait for all threads to finish
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the array with even numbers
        System.out.println("Even Numbers: " + evenNumbers);
    }
}

class EvenNumberGenerator implements Runnable {
    private List<Integer> evenNumbers;  // List to store even numbers
    private int start;  // Start of the even number range
    private int end;    // End of the even number range

    // Constructor to initialize the EvenNumberGenerator with the list and range
    public EvenNumberGenerator(List<Integer> evenNumbers, int start, int end) {
        this.evenNumbers = evenNumbers;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {  // Check if 'i' is an even number
                synchronized (evenNumbers) {
                    evenNumbers.add(i);  // Add the even number to the list, synchronized to avoid concurrent modification
                }
            }
        }
    }
}
