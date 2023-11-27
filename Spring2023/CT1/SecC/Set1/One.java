package Spring2023.CT1.SecC.Set1;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] arr = new int[] {2, 2, 1, 0, 1, 1, 2, 8};

        if (a > b) {
            int sum = 0;

            for (int i = 0; i < 8; i++) {
                sum += arr[i];
            }

            System.out.println(sum);
        } else {
            int max = 0;

            for (int i = 0; i < 8; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            System.out.println(max);
        }

        scanner.close();
    }
}