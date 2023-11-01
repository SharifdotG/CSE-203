package Fall2022.Final.Six.A;

public class MultiLevelTryCatchExample {
    public static void main(String[] args) {
        try {
            // Outer try-catch block
            int[] numbers = {1, 2, 3};
            System.out.println("Outer try-catch started.");

            try {
                // Inner try-catch block
                System.out.println("Inner try-catch started.");
                int result = numbers[5] / 0; // This will cause an ArithmeticException

                // The exception is not handled here and will propagate to the outer catch block.
                System.out.println("This line will not be executed in the inner try-catch.");
            } catch (ArrayIndexOutOfBoundsException innerException) {
                System.out.println("Inner Exception: " + innerException);
            }

            // This line will not be executed in the inner try-catch because an exception occurred.
            System.out.println("This line will not be executed in the outer try-catch.");
        } catch (ArithmeticException outerException) {
            System.out.println("Outer Exception: " + outerException);
        }

        System.out.println("Program continues after handling exceptions.");
    }
}
