package Fall2022.Mid.One;

public class Electronics {
    private String name;
    private String color;
    private int batteryPercentage;

    public Electronics(String name, String color, int batteryPercentage) {
        this.name = name;
        this.color = color;
        this.batteryPercentage = batteryPercentage;
    }

    public String getName() {
        return name;
    }

    public void running(int time) {
        batteryPercentage -= time;
    }

    public void showCharging() {
        if (batteryPercentage < 20) {
            System.out.println("Charging is needed.");
        } else {
            System.out.println("No charging is needed.");
        }
    }
}
