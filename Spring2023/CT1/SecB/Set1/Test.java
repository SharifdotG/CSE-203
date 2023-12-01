package Spring2023.CT1.SecB.Set1;

public class Test {
    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        while (count < 5) {
            if (isPrime(i)) {
                System.out.print(i + ", ");
                count++;
            }
            i++;
        }
    }

    public static boolean isPrime(int num) {
        if (num == 1)
            return false;
        if (num == 2)
            return true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
