package Spring2023.CT5.SecB.SetB.One;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSE203ScoreProcessor {

    public static void main(String[] args) {
        // Input and output file paths
        String inputPath = "D:\\Programming\\VSCode\\CSE 203 CT Solve\\Spring2023\\CT5\\SecB\\SetB\\One\\input.txt";
        String outputPath = "D:\\Programming\\VSCode\\CSE 203 CT Solve\\Spring2023\\CT5\\SecB\\SetB\\One\\output.txt";

        try {
            // Create a Scanner to read from the input file
            Scanner scanner = new Scanner(new File(inputPath));
            
            // Create a FileWriter to write to the output file
            FileWriter writer = new FileWriter(outputPath);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                
                if (parts.length >= 5) {
                    String studentId = parts[0];
                    int maxScore = Integer.MIN_VALUE;
                    int minScore = Integer.MAX_VALUE;

                    for (int i = 1; i <= 4; i++) {
                        int score = Integer.parseInt(parts[i]);
                        maxScore = Math.max(maxScore, score);
                        minScore = Math.min(minScore, score);
                    }

                    // Write the student ID, maximum, and minimum scores to the output file
                    writer.write(studentId + " " + maxScore + " " + minScore + "\n");
                }
            }
            
            // Close the input and output files
            scanner.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
