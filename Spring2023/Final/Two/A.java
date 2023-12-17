package Spring2023.Final.Two;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double height = scanner.nextDouble();
        double weight = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Welcome " + name + "!");
        System.out.print("Your BMI is " + bmi + " ");

        if (bmi < 18.5) System.out.println("Underweight");
        else if (bmi >= 18.5 && bmi < 24.9) System.out.println("Normal Weight");
        else if (bmi >= 25 && bmi < 29.9) System.out.println("Overweight");
        else if (bmi >= 30 && bmi < 34.9) System.out.println("Obesity I");
        else if (bmi >= 35 && bmi < 39.9) System.out.println("Obesity II");
        else System.out.println("Obesity III (Morbidly Obese)");

        scanner.close();
    }
}