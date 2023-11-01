package Fall2022.CT1.SetA;

public class Six {
    public static void main(String[] args) {
        // 6.
        for (int i = 0; i < 2; i--) {
            System.out.println(i);
        }
        /*
         * Problem: Infinite loop
         * As the value of i is 0, the condition i < 2 is true.
         * The loop will execute and the value of i will be decremented by 1.
         * And this will continue until the value of i becomes infinite.
         * So the loop will execute infinitely.
         */
    }
}
