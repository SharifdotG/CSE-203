package Spring2023.CT5.SecA.SetB.One;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AttendanceProcessor {
    public static void main(String[] args) {
        // File path to the input file
        String filePath = "D:\\Programming\\VSCode\\CSE 203 CT Solve\\Spring2023\\CT5\\SecA\\SetB\\One\\intput.txt";
        try {
            // Open the file
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;

            // Read each line from the file
            while ((line = br.readLine()) != null) {
                // Split the line into ID and attendance records
                String[] tokens = line.split(" ");
                String id = tokens[0];
                int presentCount = 0;
                int absentCount = 0;

                // Count the presence and absence
                for (int i = 1; i < tokens.length; i++) {
                    if (tokens[i].equals("P")) {
                        presentCount++;
                    } else if (tokens[i].equals("A")) {
                        absentCount++;
                    }
                }

                // Output attendance info
                System.out.println(id + " " + presentCount + " " + absentCount);
            }

            // Close the file
            br.close();
        } catch (IOException e) {
            // Handle file IO exception
            e.printStackTrace();
        }
    }
}
