package Fall2022.CT5.SecA.SetA.One;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberExtractor {
    public static void main(String[] args) {
        /*
         * fileName is the path of the file to be read.
         */
        String fileName = "D:\\Programming\\VSCode\\CSE 203 CT Solve\\Fall2022\\CT5\\SecA\\SetA\\One\\data.txt";

        /*
         * Read the file line by line and extract numbers from each line. Print the extracted numbers.
         */
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line; // Stores a line of the file

            /*
             * Read the file line by line and extract numbers from each line. Print the extracted numbers.
             */
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split the line into words
                for (String word : words) {
                    // Use regular expression to match and extract numbers
                    Pattern pattern = Pattern.compile("\\d+");
                    Matcher matcher = pattern.matcher(word); // Match the word with the pattern
                    
                    /*
                     * Print the extracted numbers from the word if any.
                     */
                    while (matcher.find()) {
                        String number = matcher.group();
                        System.out.println(number);
                    }
                }
            }
        } catch (IOException e) { // Catch any exception that may occur during file reading
            e.printStackTrace();
        }
    }
}
