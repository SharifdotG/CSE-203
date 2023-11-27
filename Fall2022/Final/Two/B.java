package Fall2022.Final.Two;

import java.util.Scanner;

public class B {
    public static boolean isPrime(int n) {
        if (n == 1) return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < 6; i++) {
            if (isPrime(arr[i])) {
                sum += arr[i];
            }
        }

        System.out.println(sum);

        scanner.close();
    }
}
