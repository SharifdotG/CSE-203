public class Five {
    public static void main(String[] args) {
        // 5.
        int a = 5;
        if (a > 1 && a < 5) // Error 1: no if block, though there are two lines of code.
            System.out.println("Valid input");
            a--;
        else
            System.out.println("Invalid input");
    }
}
