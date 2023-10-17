package Spring2023.CT3.SecB.SetA.One;

public class House implements Door {
    private double width;
    private double height;

    public House(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void openDoor() {
        // Implement the openDoor method here
        System.out.println("The door is open.");
    }

    @Override
    public void closeDoor() {
        // Implement the closeDoor method here
        System.out.println("The door is closed.");
    }
}