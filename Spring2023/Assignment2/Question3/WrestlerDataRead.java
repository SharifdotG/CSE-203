package Spring2023.Assignment2.Question3;

import java.io.*;

public class WrestlerDataRead {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\Programming\\VSCode\\CSE 203 CT Solve\\Spring2023\\Assignment2\\Question3\\data.txt"));
            
            String[] w1Data = br.readLine().split(", ");
            String[] w2Data = br.readLine().split(", ");

            Wrestler w3 = new Wrestler(w1Data[0], Integer.parseInt(w1Data[1]), w1Data[2]);
            Wrestler w4 = new Wrestler(w2Data[0], Integer.parseInt(w2Data[1]), w2Data[2]);

            System.out.println(w3);
            System.out.println(w4);

            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
