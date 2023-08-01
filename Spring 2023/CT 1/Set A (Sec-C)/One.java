/*
 * 1. Take Take 2 integer inputs and then declare and initialize an array
 * with your own registration number like this: A[] = {2, 2, 1, 0, 1, 1, 2, 8};
 * 10 Marks
 * 
 * a) If the first integer number is greater than the second integer number.
 * print the sum of the array elements.
 * 
 * b) Otherwise print the largest element in the array.
 */

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        /*
         * intialize array with your registration number
         */
        int[] array = new int[] { 2, 2, 1, 0, 1, 1, 2, 8 };

        int sum = 0;
        if (firstNumber > secondNumber) {
            for (int x : array) {
                sum += x;
            }
            System.out.println(sum);
        } else {
            int max = array[0];
            for (int x : array) {
                if (x > max) {
                    max = x;
                }
            }
            System.out.println(max);
        }
        scanner.close();
    }
}