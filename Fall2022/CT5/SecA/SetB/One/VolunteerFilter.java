package Fall2022.CT5.SecA.SetB.One;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class VolunteerFilter {
    public static void main(String[] args) {
        /*
         * batch is the batch number to filter
         * fileName is the path of the file to read
         */
        String batch = "21";
        String fileName = "D:\\Programming\\VSCode\\CSE 203 CT Solve\\Fall2022\\CT5\\SecA\\SetB\\One\\volunteers.txt";

        /*
         * try block is used to read the file and print the lines
         * that start with the batch number given in the batch variable
         */
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line; // line variable is used to store the current line

            /*
             * readLine() method returns null when the end of
             * the file is reached and the loop stops executing
             */
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" "); // split the line by space
                if (parts.length == 2) { // check if the line has 2 parts
                    String id = parts[1]; // id is the second part of the line
                    if (id.startsWith(batch)) { // check if the id starts with the batch number
                        System.out.println(line); // print the line
                    }
                }
            }
        } catch (IOException e) { // catch the exception if any
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
