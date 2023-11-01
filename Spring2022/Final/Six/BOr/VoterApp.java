package Spring2022.Final.Six.BOr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class VoterApp {
    public static void main(String[] args) {
        try {
            // Open the file for reading
            BufferedReader reader = new BufferedReader(new FileReader("D:\\Programming\\VSCode\\CSE 203 CT Solve\\Spring2022\\Final\\Six\\BOr\\voter.txt"));

            // Read the file line by line
            String line;
            while ((line = reader.readLine()) != null) {
                // Split each line into name and age
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    String name = parts[0];
                    int age = Integer.parseInt(parts[1]);

                    // Check if the person is eligible to vote
                    if (age >= 18 && age <= 90) {
                        System.out.println(name + " " + age);
                    }
                }
            }

            // Close the file
            reader.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
