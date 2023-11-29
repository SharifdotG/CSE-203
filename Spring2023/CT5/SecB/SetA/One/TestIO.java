package Spring2023.CT5.SecB.SetA.One;

import java.io.*;

public class TestIO {
    public static void main(String[] args) {
        Student s1 = new Student("Raihan", 123, 3.5);
        Student s2 = new Student("Laila", 124, 3.75);

        // Task 1: Write code to store the values of the instance
        // variables of s1 and s2 into a file named "students.txt"
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Programming\\VSCode\\CSE 203 CT Solve\\Spring2023\\CT5\\SecB\\SetA\\One\\students.txt"));
            bw.write(s1.name + ", " + s1.id + ", " + s1.cgpa + "\n");
            bw.write(s2.name + ", " + s2.id + ", " + s2.cgpa + "\n");

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Task 2:Write code to read the values from "students.txt",
        // create 2 Student type object s3 and s4 using those values
        // and then print the values of those to objects
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\Programming\\VSCode\\CSE 203 CT Solve\\Spring2023\\CT5\\SecB\\SetA\\One\\students.txt"));
            String[] s1Data = br.readLine().split(", ");
            String[] s2Data = br.readLine().split(", ");

            Student s3 = new Student(s1Data[0], Integer.parseInt(s1Data[1]), Double.parseDouble(s1Data[2]));
            Student s4 = new Student(s2Data[0], Integer.parseInt(s2Data[1]), Double.parseDouble(s2Data[2]));

            System.out.println(s3);
            System.out.println(s4);

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}