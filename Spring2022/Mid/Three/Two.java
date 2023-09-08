package Three;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three integers:");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int highest = Math.max(num1, Math.max(num2, num3));

        int squareOfHighest = highest * highest;

        System.out.println("The square of the highest number is: " + squareOfHighest);

        scanner.close();
    }
}
