package Spring2023.Final.Three;

public abstract class Phone {
    private String manufacturer;
    private int storage;
    private int batteryPower;

    public Phone(String manufacturer, int storage, int batteryPower) {
        this.manufacturer = manufacturer;
        this.storage = storage;
        this.batteryPower = batteryPower;
    }

    public abstract void call(String toPhNum);

    public abstract void sendMessage(String toPhNum, String msg);
}