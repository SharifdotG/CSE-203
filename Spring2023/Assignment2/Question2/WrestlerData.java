package Spring2023.Assignment2.Question2;

import java.io.*;

public class WrestlerData {
    public static void main(String[] args) {
        Wrestler w1 = new Wrestler("John Cena", 46, "Attitude Adjustment");
        Wrestler w2 = new Wrestler("The Rock", 51, "Rock Bottom");

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Programming\\VSCode\\CSE 203 CT Solve\\Spring2023\\Assignment2\\Question2\\data.txt"));
            
            bw.write(w1 + "\n");
            bw.write(w2 + "\n");

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
