abstract class Vehicle {
    // Instance variables
    protected String model;
    protected double enginePower;

    // Parameterized Constructor
    public Vehicle(String model, double enginePower) {
        this.model = model;
        this.enginePower = enginePower;
    }

    // Concrete method to get engine power
    public double getEnginePower() {
        return enginePower;
    }

    // Concrete method to display vehicle information
    public void display() {
        System.out.println("Model: " + model);
        System.out.println("Engine Power: " + enginePower);
    }

    // Abstract method to run the vehicle
    public abstract void run();

    // Abstract method to accelerate the vehicle
    public abstract void accelerate(double rate);
}
