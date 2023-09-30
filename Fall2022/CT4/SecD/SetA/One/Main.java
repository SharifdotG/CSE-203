package Fall2022.CT4.SecD.SetA.One;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*
         * filePath is the path of the file that contains the data.
         */
        String filePath = "D:\\Programming\\VSCode\\CSE 203 CT Solve\\Fall2022\\CT4\\SecD\\SetA\\One\\score.txt";

        /*
         * try block is used to open the file and read the data.
         */
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line; // to store each line of the file
            int[] maxScores = new int[3]; // to store the maximum scores of each CT

            /*
             * readLine() method reads a line from the file and returns it.
             * It returns null if the end of the file is reached.
             */
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(" "); // split the line into tokens
                
                /*
                 * tokens[0] contains the CT number and tokens[1], tokens[2], tokens[3] contain the scores.
                 */
                for (int i = 0; i < 3; i++) {
                    int score = Integer.parseInt(tokens[i + 1]); // convert the score to integer
                    
                    /*
                     * if the score is greater than the maximum score of the CT,
                     * then update the maximum score.
                     */
                    if (score > maxScores[i]) {
                        maxScores[i] = score;
                    }
                }
            }

            /*
             * print the maximum scores of each CT.
             */
            for (int i = 0; i < 3; i++) {
                System.out.println("CT" + (i + 1) + " - " + maxScores[i]);
            }

        } catch (IOException e) { // catch the exception if any error occurs while reading the file
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}


