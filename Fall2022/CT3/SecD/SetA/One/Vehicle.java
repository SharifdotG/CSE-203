package Fall2022.CT3.SecD.SetA.One;

public class Vehicle {
    String model;
    double enginePower;
    double speed;

    public Vehicle(String model, double enginePower) {
        this.model = model;
        this.enginePower = enginePower;
    }

    public void run() {
        System.out.println("Running at speed: "+ speed);
    }
    
    public void accelarate(double rate) {
        speed += rate;
    }
}
