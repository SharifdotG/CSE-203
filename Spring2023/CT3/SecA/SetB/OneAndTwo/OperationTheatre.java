package Spring2023.CT3.SecA.SetB.OneAndTwo;

public class OperationTheatre extends Room implements Door {
    private String[] equipments;

    public OperationTheatre(int length, int width, String[] equipments) {
        super(length, width); // Call the constructor of the parent class
        this.equipments = equipments;
    }

    // Implementing methods from the Door interface
    @Override
    public void openDoor() {
        // Implement the door opening logic here
        System.out.println("Operation theatre door opened.");
    }

    @Override
    public void closeDoor() {
        // Implement the door closing logic here
        System.out.println("Operation theatre door closed.");
    }

    @Override
    public boolean isOpen() {
        // Implement the logic to check if the door is open
        // You can use a boolean variable to store the door's open/closed state
        // and return its value here.
        return true; // For demonstration purposes
    }
}
