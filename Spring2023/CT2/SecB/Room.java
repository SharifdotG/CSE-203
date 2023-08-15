public class Room {
    public static void main(String[] args) {
        Fan myFan = new Fan("Walton", "Ceiling", 20);

        myFan.turnOn(10 + (8 % 10));

        myFan.increaseSpeed(2);

        myFan.display();
    }
}

/*
 * Output:
 * Manufacturer: Walton
 * Category: Ceiling
 * Max Speed: 20
 */