package Spring2022.Final.Five.B;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestThread {
    public static void main(String[] args) {
        try {
            new FileReader("test.txt").read();
        } catch (FileNotFoundException e) {
            // Handle FileNotFoundException here
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            // Handle other IOException here
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
