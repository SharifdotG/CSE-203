package Spring2023.CT3.SecA.SetB.OneAndTwo;

public class Room {
    int length, width;

    public Room(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }
}
