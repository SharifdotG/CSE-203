package Fall2022.CT5.SecB.SetB.One;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UAPVolunteers {
    public static void main(String[] args) {
        /*
         * filePath is the absolute path of the file.
         * You can change it according to your file location.
         */
        String filePath = "D:\\Programming\\VSCode\\CSE 203 CT Solve\\Fall2022\\CT5\\SecB\\SetB\\One\\volunteersB.txt";

        /*
         * try block is used to open the file.
         * If the file is not found, it will throw an exception.
         */
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line; // Stores each line of the file temporarily in this variable.
            
            /*
             * readLine() method returns the next line of the file.
             */
            while ((line = br.readLine()) != null) {
                /*
                 * split() method splits the line into an array of strings.
                 * name, id and email are stored in the array.
                 */
                String[] parts = line.split("\\s+");

                /*
                 * Check if the array has 3 elements.
                 */
                if (parts.length == 3) {
                    String name = parts[0];
                    String id = parts[1];
                    String email = parts[2];

                    /*
                     * Check if the email ends with "@uap-bd.edu".
                     */
                    if (email.endsWith("@uap-bd.edu")) {
                        System.out.println(name + " " + id + " " + email);
                    }
                }
            }
        } catch (IOException e) { // If the file is not found, it will catch the exception.
            e.printStackTrace();
        }
    }
}
