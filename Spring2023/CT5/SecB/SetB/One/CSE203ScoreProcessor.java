package Spring2023.CT5.SecB.SetB.One;

import java.io.*;

public class CSE203ScoreProcessor {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\Programming\\VSCode\\CSE 203 CT Solve\\Spring2023\\CT5\\SecB\\SetB\\One\\input.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Programming\\VSCode\\CSE 203 CT Solve\\Spring2023\\CT5\\SecB\\SetB\\One\\output.txt"));

            String line;
            
            while ((line = br.readLine()) != null) {
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

                    bw.write(studentId + " " + maxScore + " " + minScore + "\n");
                }
            }

            br.close();
            bw.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
