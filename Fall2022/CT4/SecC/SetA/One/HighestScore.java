import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HighestScore {
    public static void main(String[] args) {
        /*
         * Change the file path to your local file path
         */
        String fileName = "D:\\Programming\\VSCode\\CSE 203 CT Solve\\Fall2022\\CT4\\SecC\\SetA\\One\\score.txt";

        /*
         * try block to read the file and catch block to catch the exception
         */
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            
            while ((line = br.readLine()) != null) {
                /*
                 * Split the line by space and store the tokens in an array to get the student ID and scores separately
                 */
                String[] tokens = line.split(" ");

                /*
                 * Checking to see if the line contains at least 4 tokens (student ID, 3 scores)
                 */
                if (tokens.length >= 4) {
                    String studentID = tokens[0]; // First token is the student ID
                    int highestScore = Integer.parseInt(tokens[1]); // Second token is the first score and it is the highest score by default

                    /*
                     * Looping through the rest of the tokens to find the highest score
                     */
                    for (int i = 2; i < tokens.length; i++) {
                        int score = Integer.parseInt(tokens[i]);

                        /*
                         * If the current score is greater than the highest score, then the current score is the highest score
                         */
                        if (score > highestScore) highestScore = score;
                    }
                    /*
                     * Printing the student ID and the highest score
                     */
                    System.out.println(studentID + " " + highestScore);
                }
            }
        } catch (IOException e) { // Catching the exception
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
