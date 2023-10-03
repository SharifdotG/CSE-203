package Fall2022.CT4.SecC.SetB.Two;

import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double data = scan.nextDouble();
        
        /*
         * call the mathRoot and pass the data as the parameter.
         * If no Exception is thrown from the call, print the result.
         * Otherwise print the Exception message****/
        try {
            int result = mathRoot(data);

            System.out.println("Square root: " + result);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        scan.close();
    }

    public static int mathRoot(double num) throws Exception {
        //Throw an Exception with message saying "Can’t find the square root
        //of a negative number." Also update the method to fix any error
        if (num < 0) {
            throw new Exception("Can't find the square root of a negative number.");
        } else {
            return (int) Math.sqrt(num);
        }
    }
}

