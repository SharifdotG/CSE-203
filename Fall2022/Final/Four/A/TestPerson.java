package Fall2022.Final.Four.A;

import java.util.Scanner;

public class TestPerson {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int id = scan.nextInt();
        String name = scan.next();
        String phoneNo = scan.next();

        Person p = new Person(name, phoneNo);
        int output = p.findMagicNumber(id);
        System.out.println(output);
        scan.close();
    }
}
