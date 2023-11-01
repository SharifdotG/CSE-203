package Fall2022.CT3.SecC.SetA;

public class Car extends Vehicle {
    // Constructor for Car class
    public Car(String model, double enginePower) {
        super(model, enginePower);
    }

    // Implementation of the abstract method 'run'
    @Override
    public void run() {
        // Add code here to make the car run
        System.out.println("The car is running.");
    }

    // Implementation of the abstract method 'accelerate'
    @Override
    public void accelerate(double rate) {
        // Add code here to make the car accelerate
        System.out.println("The car is accelerating at a rate of " + rate + " km/h^2.");
    }
}
