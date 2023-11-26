package Spring2023.CT3.SecA.SetB.OneAndTwo;

public class OperationTheatre extends Room implements Door {
    private String[] equipments;

    public OperationTheatre(int length, int width, String[] equipments) {
        super(length, width);
        this.equipments = equipments;
    }

    @Override
    public void openDoor() {}

    @Override
    public void closeDoor() {}

    @Override
    public boolean isOpen() {
        return true;
    }
}
