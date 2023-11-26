package Fall2022.Final.ThreeOr;

public class Car implements Engine {
    String model;
    int speed;
    
    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }
    
    @Override
    public void start() {
        System.out.println(model + " started at speed=" + speed + ".");
    }

    @Override
    public void running(int min) {
        System.out.println("Running at speed=" + speed + ".");
        System.out.println("Distance covered=" + speed * min + ".");
    }

    @Override
    public void stop() {
        System.out.println("Stopped.");
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota Corolla", 30);

        car.start();
        car.running(10);
        car.speed = 40;
        car.running(5);
        car.stop();
    }
}
