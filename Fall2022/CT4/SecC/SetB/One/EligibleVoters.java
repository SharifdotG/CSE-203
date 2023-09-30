package Fall2022.CT4.SecC.SetB.One;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EligibleVoters {
    public static void main(String[] args) {
        String fileName = "D:\\Programming\\VSCode\\CSE 203 CT Solve\\Fall2022\\CT4\\SecC\\SetB\\One\\people.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    String id = parts[0];
                    int age = Integer.parseInt(parts[1]);

                    if (age >= 18) {
                        System.out.println(id + " " + age);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}

