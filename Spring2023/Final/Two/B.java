package Spring2023.Final.Two;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];

        int sum = 0;

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }

        System.out.println(sum);
        System.out.println(sum / number);

        scanner.close();
    }
}
