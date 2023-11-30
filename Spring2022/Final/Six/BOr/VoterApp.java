package Spring2022.Final.Six.BOr;

import java.io.*;

public class VoterApp {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\Programming\\VSCode\\CSE 203 CT Solve\\Spring2022\\Final\\Six\\BOr\\voter.txt"));

            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    String name = parts[0];
                    int age = Integer.parseInt(parts[1]);

                    if (age >= 18 && age <= 90) {
                        System.out.println(name + " " + age);
                    }
                }
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
