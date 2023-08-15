public class Room {
    public static void main(String[] args) {
        Fan myFan = new Fan("Walton", "Ceiling", 20);

        int id = 8;
        myFan.turnOn(10 + (id % 10));

        myFan.increaseSpeed(2);

        myFan.display();
    }
}
