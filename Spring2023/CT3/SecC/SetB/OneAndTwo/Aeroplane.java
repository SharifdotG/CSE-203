package Spring2023.CT3.SecC.SetB.OneAndTwo;

public class Aeroplane extends Vehicle implements Engine {
    private int enginePower;

    public Aeroplane(String model, int enginePower) {
        super(model); // Call the constructor of the superclass (Vehicle) with the 'model' parameter
        this.enginePower = enginePower;
    }

    @Override
    public void startEngine() {
        System.out.println("Aeroplane engine started");
    }

    @Override
    public void run() {
        System.out.println("Aeroplane is flying");
    }

    @Override
    public void stopEngine() {
        System.out.println("Aeroplane engine stopped");
    }
}