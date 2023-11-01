package Spring2023.CT5.SecB.SetA.One;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestIO {
    public static void main(String[] args) {
        Student s1 = new Student("Raihan", 123, 3.5);
        Student s2 = new Student("Laila", 124, 3.75);

        // Task 1: Write code to store the values of the instance
        // variables of s1 and s2 into a file named "students.txt"
        try (PrintWriter writer = new PrintWriter(new FileWriter("D:\\Programming\\VSCode\\CSE 203 CT Solve\\Spring2023\\CT5\\SecB\\One\\students.txt"))) {
            writer.println(s1.name + ", " + s1.id + ", " + s1.cgpa);
            writer.println(s2.name + ", " + s2.id + ", " + s2.cgpa);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Task 2:Write code to read the values from "students.txt",
        // create 2 Student type object s3 and s using those values
        // and then print the values of those to objects
        try (Scanner scanner = new Scanner(new File("D:\\Programming\\VSCode\\CSE 203 CT Solve\\Spring2023\\CT5\\SecB\\One\\students.txt"))) {
            String[] s1Data = scanner.nextLine().split(", ");
            String[] s2Data = scanner.nextLine().split(", ");
            Student s3 = new Student(s1Data[0], Integer.parseInt(s1Data[1]), Double.parseDouble(s1Data[2]));
            Student s4 = new Student(s2Data[0], Integer.parseInt(s2Data[1]), Double.parseDouble(s2Data[2]));

            System.out.println(s3.toString());
            System.out.println(s4.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}