package Spring2023.CT1.SecB.Set1;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int count = 0;
        int i = num + 1;
        while (count < 3) {
            if (isPrime(i)) {
                System.out.print(i + ", ");
                count++;
            }
            i++;
        }

        scanner.close();
    }

    public static boolean isPrime(int num) {
        if (num == 1)
            return false;
        if (num == 2)
            return true;
        if (num % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(num); i += 2)
            if (num % i == 0)
                return false;

        return true;
    }
}