package Fall2022.Final.Two;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }

        System.out.println(sum);

        Scanner.close();
    }
}