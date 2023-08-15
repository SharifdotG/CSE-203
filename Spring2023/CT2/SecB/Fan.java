public class Fan {
    public String manufacturer;
    public String category;
    public int speed;
    public boolean isOn;
    public int maxSpeed;

    public Fan(String manufacturer, String category, int maxSpeed) {
        this.manufacturer = manufacturer;
        this.category = category;
        this.maxSpeed = maxSpeed;
    }

    public void turnOn(int fanSpeed) {
        isOn = true;
        if (fanSpeed <= maxSpeed) {
            speed = fanSpeed;
        } else {
            speed = maxSpeed;
        }
    }

    public void increaseSpeed(int amt) {
        speed += amt;
        if (speed > maxSpeed) {
            speed = maxSpeed;
        }
    }

    public void decreaseSpeed(int amt) {
        speed -= amt;
        if (speed < 0) {
            speed = 0;
        }
    }

    public void display() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Category: " + category);
        System.out.println("Max Speed: " + maxSpeed);
    }
}