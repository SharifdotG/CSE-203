package Fall2022.CT5.SecB.SetA.One;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * filePath is the absolute path of the file.
         * You can change it according to your file location.
         */
        String filePath = "D:\\Programming\\VSCode\\CSE 203 CT Solve\\Fall2022\\CT5\\SecB\\SetA\\One\\students.txt";

        /*
         * try block is used to open the file.
         * If the file is not found, it will throw an exception.
         */
        try (Scanner scanner = new Scanner(new File(filePath))) {
            /*
             * hasNext() method returns true if the file has more tokens.
             */
            while (scanner.hasNext()) {
                String token = scanner.next(); // next() method returns the next token from the file.

                /*
                 * isValidEmail() method checks if the token is a valid email or not.
                 * If it is a valid email, it will print the email.
                 */
                if (isValidEmail(token)) {
                    System.out.println(token);
                }
            }
        } catch (FileNotFoundException e) { // If the file is not found, it will catch the exception.
            System.err.println("File not found: " + e.getMessage());
        }
    }

    /*
     * isValidEmail() method checks if the token is a valid email or not.
     * It returns true if the token is a valid email.
     * Otherwise, it returns false.
     */
    private static boolean isValidEmail(String str) {
        return str.contains("@") && str.indexOf("@") == str.lastIndexOf("@");
    }
}
