package Fall2022.CT1.SecC;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        // 3.
        Scanner scanner = new Scanner(System.in);
        int a = 5;
        int b = scanner.nextInt(); // Input is your Registration number
        int c = ++a * b++;
        System.out.printf("%d:%d:%d", a, b, c);
        scanner.close();
        /*
         * if, Input: b = 28
         * Output: 6:29:168
         */
    }
}