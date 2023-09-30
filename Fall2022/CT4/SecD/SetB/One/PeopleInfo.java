package Fall2022.CT4.SecD.SetB.One;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PeopleInfo {
    public static void main(String[] args) {
        /*
         * fileName is the path of the file that contains the data.
         */
        String fileName = "D:\\Programming\\VSCode\\CSE 203 CT Solve\\Fall2022\\CT4\\SecD\\SetB\\One\\people.txt";

        /*
         * try block is used to open the file and read the data.
         */
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line; // to store each line of the file

            /*
             * readLine() method reads a line from the file and returns it.
             * It returns null if the end of the file is reached.
             */
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" "); // split the line into tokens (id and age)
                String id = parts[0]; // id is the first token of the line (parts[0])
                int age = Integer.parseInt(parts[1]); // age is the second token of the line (parts[1]) converted to integer (int) type

                /*
                 * if the age is greater than or equal to 70, then print the id and age.
                 */
                if (age >= 70) {
                    System.out.println(id + " " + age);
                }
            }
        } catch (IOException e) { // catch the exception if any error occurs while reading the file
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
