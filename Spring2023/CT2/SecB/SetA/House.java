package Spring2023.CT2.SecB.SetA;

public class House {
    public static void main(String[] args) {
        // Create an object of AirCooler with brand as your name and type as "Window AC"
        AirCooler myAc = new AirCooler("YourName", "Window AC");

        // Call the turnOn method with the calculated temperature
        myAc.turnOn(14 + 28 % 15);

        // Call the isRunning method and print the output
        System.out.println(myAc.isRunning());

        // Call the display method
        myAc.display();
    }
}

