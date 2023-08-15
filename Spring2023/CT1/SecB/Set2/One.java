package Spring2023.CT1.SecB.Set2;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            for (int i = b + 1; i < a; i++) {
                if (i % 2 == 0 && i % 3 != 0) {
                    System.out.print(i + ", ");
                }
            }
        } else {
            for (int i = a + 1; i < b; i++) {
                if (i % 2 == 0 && i % 3 != 0) {
                    System.out.print(i + ", ");
                }
            }
        }

        scanner.close();
    }
}
