package Spring2023.CT3.SecC.SetB.OneAndTwo;

public class Aeroplane extends Vehicle implements Engine {
    private int enginePower;

    public Aeroplane(String model, int enginePower) {
        super(model);
        this.enginePower = enginePower;
    }

    @Override
    public void startEngine() {}

    @Override
    public void run() {}

    @Override
    public void stopEngine() {}
}