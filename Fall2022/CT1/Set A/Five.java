package Fall2022.CT1.SetA;

public class Five {
    public static void main(String[] args) {
        // 5.
        int a = 5;
        if (a > 1 && a < 5) // Error 1: no if block, though there are two lines of code.
            System.out.println("Valid input");
            a--;
        else // Error 2: else without if because of the previous error.
            System.out.println("Invalid input"); // Error 3: unreachable code.
    } // Error 4: missing closing brace.
} // Error 5: missing closing brace.
