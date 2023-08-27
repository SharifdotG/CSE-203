package Fall2022.Mid.One;

public class Electronics {
    private String name;
    private String color;
    private int batteryPercentage;

    // Parameterized constructor
    public Electronics(String name, String color, int batteryPercentage) {
        this.name = name;
        this.color = color;
        this.batteryPercentage = batteryPercentage;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Method to simulate running and decrease batteryPercentage
    public void running(int time) {
        batteryPercentage -= time;
    }

    // Method to check if charging is needed
    public void showCharging() {
        if (batteryPercentage < 20) {
            System.out.println("Charging is needed.");
        } else {
            System.out.println("No charging is needed.");
        }
    }
}
