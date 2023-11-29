package Spring2023.Assignment2.Question3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class WrestlerDataRead {
    public static void main(String[] args) {
        ArrayList<Wrestler> wrestlers = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("D:\\Programming\\VSCode\\CSE 203 CT Solve\\Spring2023\\Assignment2\\Question3\\data.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");

                if (parts.length == 3) {
                    String name = parts[0];
                    int age = Integer.parseInt(parts[1]);
                    String finishingMove = parts[2];

                    Wrestler wrestler = new Wrestler(name, age, finishingMove);
                    wrestlers.add(wrestler);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (Wrestler wrestler : wrestlers) {
            System.out.println(wrestler);
        }
    }
}
