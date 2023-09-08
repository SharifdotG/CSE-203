package OneOr;

public class Box extends Rectangle {
    public double height;

    // Parameterized constructor for Box
    public Box(double length, double width, double height) {
        super(length, width); // Call the constructor of the superclass (Rectangle)
        this.height = height;
    }

    // Method to calculate the volume of the box
    public double getVolume() {
        return getArea() * height;
    }

    public static void main(String[] args) {
        // Create an instance of Box
        Box box = new Box(5.0, 3.0, 2.0);

        // Display attributes of the box
        box.display();

        // Calculate and display the volume of the box
        System.out.println("Volume: " + box.getVolume());
    }
}