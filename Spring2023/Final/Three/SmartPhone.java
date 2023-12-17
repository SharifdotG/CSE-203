package Spring2023.Final.Three;

public class SmartPhone extends Phone implements SmartDevice {
    private String os;

    public SmartPhone(String manufacturer, int storage, int batteryPower, String os) {
        super(manufacturer, storage, batteryPower);
        this.os = os;
    }

    @Override
    public void call(String toPhNum) {
        System.out.println("Calling " + toPhNum);
    }

    @Override
    public void sendMessage(String toPhNum, String msg) {
        System.out.println(msg);
        System.out.println("Message sent to " + toPhNum);
    }

    @Override
    public void runApp(String appName) {
        System.out.println("Running app: " + appName);
    }

    public void call(String toPhNum, String usingApp) {
        runApp(usingApp);
        call(toPhNum);
    }
}
