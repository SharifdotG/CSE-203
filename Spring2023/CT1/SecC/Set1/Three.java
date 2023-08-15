package Spring2023.CT1.SecC.Set1;

public class Three {
    public static void main(String[] args) {
        /*
        Errors:
        int 1data = 25; // variable name cannot start with a number  
        data2 = 2 * 1data // variable data2 is not declared and 1data is not a valid variable name and there is no semicolon.
        System.out.println(“%d”, data2); // printf is not used in java
        byte b = data2; // data2 is not declared and cannot be assigned to byte
        System.out.println(b*b); // b is not declared
        */

        // Fixed Code
        int data1 = 25; 
        int data2 = 2 * data1; 
        System.out.printf("%d", data2); 
        byte b = (byte)data2; 
        System.out.println(b*b);
    }
}
