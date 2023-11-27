package Spring2022.Final;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a % 2 == 0) {
            int[] arr = new int[10];
            int sum = 0;
            
            for (int i = 0; i < 10; i++) {
                arr[i] = scanner.nextInt();
                if (arr[i] % 2 == 0) {
                    sum += arr[i];
                }
            }

            System.out.println(sum);
        }

        if (b > a) {
            int count = 0;
            int i = 2;

            while (count < 5) {
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.print(i + " ");
                    count++;
                }
                i++;
            }
        }

        scanner.close();
    }
}
