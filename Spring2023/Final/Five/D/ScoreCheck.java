package Spring2023.Final.Five.D;

import java.io.*;

public class ScoreCheck {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\Programming\\VSCode\\CSE 203 CT Solve\\Spring2023\\Final\\Five\\D\\score.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");

                if (parts.length == 2) {
                    String studentID = parts[0];
                    int score = Integer.parseInt(parts[1]);

                    String result = (score >= 40) ? "P" : "F";
                    System.out.println(studentID + " " + result);
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
