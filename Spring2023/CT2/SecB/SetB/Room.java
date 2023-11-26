package Spring2023.CT2.SecB.SetB;

public class Room {
    public static void main(String[] args) {
        // Create an object of Fan with manufacturer "Walton", category "Ceiling", and maxSpeed 20
        Fan myFan = new Fan("Walton", "Ceiling", 20);

        // Call the turnOn method with calculated speed
        myFan.turnOn(10 + 8 % 10);

        // Call the increaseSpeed method with the first digit of your registration number
        myFan.increaseSpeed(2);

        // Call the display method
        myFan.display();
    }
}

