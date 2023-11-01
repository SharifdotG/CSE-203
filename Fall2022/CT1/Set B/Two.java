package Fall2022.CT1.SetB;

public class Two {
    public static void main(String[] args) {
        // 2.
        int a = 3, b = 5;
        int c = ++a; // a incremented by 1, then assigned to c (a = 4)
        System.out.println(++a); // a incremented by 1, then printed (a = 5)
        System.out.printf("Output: %d\n", a++ * ++b);
        /*
         * Output:
         * 5
         * 30
         * 
         * a incremented by 1, then multiplied with b incremented by 1 (a = 6, b = 6)
         */
    }
}
