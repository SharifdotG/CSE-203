package Fall2022.CT3.SecC.SetB;

public class Car implements Door {
    private String model;
    private int noOfDoors;

    public Car(String model, int noOfDoors) {
        this.model = model;
        this.noOfDoors = noOfDoors;
    }

    @Override
    public void open() {
        System.out.println("Car door is open.");
    }

    @Override
    public void close() {
        System.out.println("Car door is closed.");
    }
}

