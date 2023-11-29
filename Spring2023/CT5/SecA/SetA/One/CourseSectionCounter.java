package Spring2023.CT5.SecA.SetA.One;

import java.io.*;

public class CourseSectionCounter {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\Programming\\VSCode\\CSE 203 CT Solve\\Spring2023\\CT5\\SecA\\SetA\\One\\intput.txt")); // "intput.txt"
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                
                if (parts.length > 0) {
                    String courseCode = parts[0];
                    int sectionCount = parts.length - 1;
                    System.out.println(courseCode + " " + sectionCount);
                }
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
