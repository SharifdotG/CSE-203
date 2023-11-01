package Fall2022.Final.Five.B;

public class Main {
    public static void main(String[] args) {
        // i) Create an object of the House class, call the getArea() method, and print the output.
        House myHouse = new House(30, 40, 5); // Replace these values with the desired parameters
        int houseArea = myHouse.getArea();
        System.out.println("House Area: " + houseArea);

        // ii) Create an object of the Inner class Room, call the getArea() method, and print the output.
        House.Room myRoom = myHouse.new Room(10, 15); // Replace these values with the desired parameters
        int roomArea = myRoom.getArea();
        System.out.println("Room Area: " + roomArea);
    }
}
