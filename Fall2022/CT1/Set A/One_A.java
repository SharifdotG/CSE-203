package Fall2022.CT1.SetA;

import java.util.Scanner;

public class One_A {
    public static void main(String[] args) {
        // 1. a)
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number % 2 == 0 && number % 5 == 0) {
            System.out.println(22101128); // Print your own Registration number
        }

        scanner.close();
    }
}
