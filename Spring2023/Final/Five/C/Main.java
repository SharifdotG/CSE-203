package Spring2023.Final.Five.C;

import java.util.Random;

class RandomNumberGenerator implements Runnable {
    private int n;
    private int min;
    private int max;

    public RandomNumberGenerator(int n, int min, int max) {
        this.n = n;
        this.min = min;
        this.max = max;
    }

    @Override
    public void run() {
        Random random = new Random();
        System.out.println("Generating " + n + " random numbers between " + min + " and " + max + ":");
        for (int i = 0; i < n; i++) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            System.out.println(randomNumber);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new RandomNumberGenerator(10, 1, 100));
        Thread thread2 = new Thread(new RandomNumberGenerator(5, 101, 200));
        Thread thread3 = new Thread(new RandomNumberGenerator(8, 201, 300));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
