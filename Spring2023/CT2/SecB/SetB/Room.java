package Spring2023.CT2.SecB.SetB;

public class Room {
    public static void main(String[] args) {
        // Replace '8' with the actual last digit of your registration number
        int lastDigit = 8;

        // Replace '2' with the actual first digit of your registration number
        int firstDigit = 2;

        // Create an object of Fan with manufacturer "Walton", category "Ceiling", and maxSpeed 20
        Fan myFan = new Fan("Walton", "Ceiling", 20);

        // Call the turnOn method with calculated speed
        myFan.turnOn(10 + lastDigit % 10);

        // Call the increaseSpeed method with the first digit of your registration number
        myFan.increaseSpeed(firstDigit);

        // Call the display method
        myFan.display();
    }
}

