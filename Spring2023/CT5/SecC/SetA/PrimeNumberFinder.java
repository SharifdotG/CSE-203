package Spring2023.CT5.SecC.SetA;

public class PrimeNumberFinder implements Runnable {
    private int min;
    private int max;

    public PrimeNumberFinder(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= (num / 2); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public void run() {
        System.out.println("Prime numbers between " + min + " and " + max + ":");

        for (int i = min; i <= max; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println();
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new PrimeNumberFinder(1, 100));
        Thread thread2 = new Thread(new PrimeNumberFinder(101, 200));
        Thread thread3 = new Thread(new PrimeNumberFinder(201, 300));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
