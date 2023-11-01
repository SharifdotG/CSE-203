package Fall2022.Final.Six.BOr;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberThread extends Thread {
    private static List<Integer> primeNumbers = new ArrayList<>();
    private static int count = 0;  // Track the count of prime numbers found
    
    @Override
    public void run() {
        for (int num = 50; num <= 80; num++) {
            if (isPrime(num)) {  // Check if 'num' is prime
                synchronized (primeNumbers) {
                    primeNumbers.add(num);  // Add prime number to the shared list
                    count++;
                    if (count >= 5) {
                        break; // Stop adding prime numbers once 5 are added
                    }
                }
            }
        }
    }
    
    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;  // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;  // If 'number' is divisible by any number in this range, it's not prime
            }
        }
        return true;  // If the loop completes without finding a divisor, the number is prime
    }
    
    public static void main(String[] args) {
        PrimeNumberThread thread1 = new PrimeNumberThread();
        PrimeNumberThread thread2 = new PrimeNumberThread();
        PrimeNumberThread thread3 = new PrimeNumberThread();
        
        thread1.start();  // Start the first thread
        thread2.start();  // Start the second thread
        thread3.start();  // Start the third thread
        
        try {
            thread1.join();  // Wait for the first thread to finish
            thread2.join();  // Wait for the second thread to finish
            thread3.join();  // Wait for the third thread to finish
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        
        System.out.println("Prime numbers: " + primeNumbers);  // Print the list of prime numbers
    }
}
