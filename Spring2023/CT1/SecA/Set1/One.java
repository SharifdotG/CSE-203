package Spring2023.CT1.SecA.Set1;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int arr[] = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > sum / n) {
                System.out.print(arr[i] + " ");
            }
        }

        scanner.close();
    }
}
