package Fall2022.CT1.SecA;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        // 1.
        Scanner scanner = new Scanner(System.in);

        // take input
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b && b == c) { // check if all are equal
            System.out.println("equal");
        } else { // if not equal
            System.out.println("not equal");
            if (a > b && a > c) { // check which is the largest
                System.out.println(a);
            } else if (b > a && b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }

        scanner.close();
    }
}
