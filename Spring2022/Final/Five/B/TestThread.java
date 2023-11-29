package Spring2022.Final.Five.B;

import java.io.*;

public class TestThread {
    public static void main(String[] args) {
        try {
            new FileReader("test.txt").read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
