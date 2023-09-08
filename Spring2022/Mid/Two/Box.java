package Two;

public class Box extends Rectangle {
    public double height;

    public Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}