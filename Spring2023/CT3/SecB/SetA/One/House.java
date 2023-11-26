package Spring2023.CT3.SecB.SetA.One;

public class House implements Door {
    private double width, height;

    public House(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void openDoor() {
        System.out.println("The door is open.");
    }

    @Override
    public void closeDoor() {
        System.out.println("The door is closed.");
    }
}