package Spring2022.Final.Six.B;

import java.util.Random;

class RandomNumberGenerator implements Runnable {
    private int min;
    private int max;

    public RandomNumberGenerator(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            System.out.println(Thread.currentThread().getName() + " " + randomNumber);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new RandomNumberGenerator(10, 20));
        Thread thread2 = new Thread(new RandomNumberGenerator(50, 60));
        Thread thread3 = new Thread(new RandomNumberGenerator(100, 120));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
