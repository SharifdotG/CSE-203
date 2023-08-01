import java.util.Scanner;

public class One_B {
    public static void main(String[] args) {
        // 1. b)
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number > 200) {
            number -= 100;
            number /= 2;
            System.out.println(number);
        }

        scanner.close();
    }
}