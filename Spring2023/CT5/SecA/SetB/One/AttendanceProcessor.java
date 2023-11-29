package Spring2023.CT5.SecA.SetB.One;

import java.io.*;

public class AttendanceProcessor {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\Programming\\VSCode\\CSE 203 CT Solve\\Spring2023\\CT5\\SecA\\SetB\\One\\intput.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(" ");
                String id = tokens[0];
                int presentCount = 0;
                int absentCount = 0;

                for (int i = 1; i < tokens.length; i++) {
                    if (tokens[i].equals("P")) {
                        presentCount++;
                    } else if (tokens[i].equals("A")) {
                        absentCount++;
                    }
                }

                System.out.println(id + " " + presentCount + " " + absentCount);
            }

            br.close();
        } catch (IOException e) {
            
        }
    }
}
