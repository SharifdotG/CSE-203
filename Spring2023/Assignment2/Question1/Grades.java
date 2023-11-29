package Spring2023.Assignment2.Question1;

import java.io.*;

public class Grades {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\Programming\\VSCode\\CSE 203 CT Solve\\Spring2023\\Assignment2\\Question1\\input.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Programming\\VSCode\\CSE 203 CT Solve\\Spring2023\\Assignment2\\Question1\\output.txt"));

            String studentDetails;
            
            while ((studentDetails = br.readLine()) != null) {
                String[] sections = studentDetails.split(" ");

                if (sections.length == 4) {
                    int id = Integer.parseInt(sections[0]);
                    int assessmentScore = Integer.parseInt(sections[1]);
                    int midScore = Integer.parseInt(sections[2]);
                    int finalScore = Integer.parseInt(sections[3]);

                    double totalScore = (0.3 * assessmentScore) + (0.2 * midScore) + (0.5 * finalScore);
                    String grade = calculateGrade(totalScore);

                    bw.write(id + " " + totalScore + " " + grade + "\n");
                }
            }

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String calculateGrade(double totalScore) {
        if (totalScore >= 80) return "A+";
        else if (totalScore >= 75) return "A";
        else if (totalScore >= 70) return "A-";
        else if (totalScore >= 65) return "B+";
        else if (totalScore >= 60) return "B";
        else if (totalScore >= 55) return "B-";
        else if (totalScore >= 50) return "C+";
        else if (totalScore >= 45) return "C";
        else if (totalScore >= 40) return "D";
        else return "F";
    }
}
