package Spring2023.CT2.SecB.SetA;

public class AirCooler {
    private String brand;
    private String type;
    private int temp;
    private boolean isOn;

    // Parameterized constructor
    public AirCooler(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    // Method to turn on the air cooler
    public void turnOn(int acTemp) {
        isOn = true;
        temp = acTemp;
    }

    // Method to check if the air cooler is running
    public boolean isRunning() {
        return isOn;
    }

    // Method to turn off the air cooler
    public void turnOff() {
        isOn = false;
        temp = 0;
    }

    // Method to display the status of the air cooler
    public void display() {
        if (isOn == true) {
            System.out.println("Running at " + temp + " temperature");
        } else {
            System.out.println("Brand: " + brand);
            System.out.println("Type: " + type);
        }
    }
}

