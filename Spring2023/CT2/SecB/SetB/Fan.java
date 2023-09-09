package Spring2023.CT2.SecB.SetB;

public class Fan {
    private String manufacturer;
    private String category;
    private int speed;
    private boolean isOn;
    private int maxSpeed;

    // Parameterized constructor
    public Fan(String manufacturer, String category, int maxSpeed) {
        this.manufacturer = manufacturer;
        this.category = category;
        this.maxSpeed = maxSpeed;
        this.speed = 0; // Fan is initially off
        this.isOn = false;
    }

    // Method to turn on the fan with a specified speed
    public void turnOn(int fanSpeed) {
        isOn = true;
        speed = (fanSpeed <= maxSpeed) ? fanSpeed : maxSpeed;
    }

    // Method to increase the fan speed
    public void increaseSpeed(int amt) {
        speed += amt;
        if (speed > maxSpeed) {
            speed = maxSpeed;
        }
    }

    // Method to decrease the fan speed
    public void decreaseSpeed(int amt) {
        speed -= amt;
        if (speed < 0) {
            speed = 0;
        }
    }

    // Method to display the attributes of the fan
    public void display() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Category: " + category);
        System.out.println("Speed: " + speed);
    }
}

