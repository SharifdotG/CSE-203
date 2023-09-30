package Fall2022.CT4.SecD.SetB.Two;

import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        /*
         * call the mathFun and pass the data as the parameter.
         * If no Exception is thrown from the call, print the result.
         * Otherwise print the Exception message****/
        Scanner scan = new Scanner(System.in);
        int data = scan.nextInt();
        
        try {
            int result = mathFun(data);
            
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        scan.close();
    }
    
    public static int mathFun(int num) throws Exception {
        // Throw an Exception with a message saying "Not an even number."
        // Also update the method to fix any error
        if (num % 2 == 0) {
            throw new Exception("Not an even number.");
        } else {
            return num / 2;
        }
    }
}

