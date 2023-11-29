package Fall2022.Final.Five.B;

public class House {
    int width, length;
    int noOfRooms;

    public House(int width, int length, int nOfRooms) {
        this.width = width;
        this.length = length;
        this. noOfRooms = nOfRooms;
    }

    public int getArea () {
        return length * width;
    }
    
    // Inner class with 2 attributes width and length.
    public class Room {
        int width, length;
        
        public Room(int width, int length) {
            this.width = width;
            this.length = length;
        }

        public int getArea () {
            return length * width;
        }
    }
}