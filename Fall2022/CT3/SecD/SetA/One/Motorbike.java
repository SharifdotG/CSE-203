package Fall2022.CT3.SecD.SetA.One;

public class Motorbike extends Vehicle {
    String style;

    public Motorbike(String model, double enginePower, String style) {
        super(model, enginePower); // Call the constructor of the superclass (Vehicle)
        this.style = style;
    }

    @Override
    public void accelarate(double rate) { // Change this to 'accelerate'
        // Increase the speed by double of the rate parameter
        speed += 2 * rate;
    }
}
