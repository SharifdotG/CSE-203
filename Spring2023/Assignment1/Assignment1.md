# CSE 203: Java - Assignment #1

## Problem 1: Abstract Class (Gaming PC Components)

```java
// Define an Abstract class with at least one abstract method.
// Make sure the class has the following. (Theme: Gaming PC Components)
abstract class PCComponent {
    // Has at least 2 instance variables.
    protected String componentName;
    protected double price;

    // Has a parameterized constructor.
    public PCComponent(String componentName, double price) {
        this.componentName = componentName;
        this.price = price;
    }

    // Has at least one instance/complete method.
    public void displayComponentInfo() {
        System.out.println("Component: " + componentName);
        System.out.println("Price: $" + price);
    }

    // Has at least one abstract method.
    public abstract void upgradeComponent();
}
```

## Problem 2: Interface (Call of Duty Games)

```java
// Define an interface with at least two abstract methods.
// Make sure the methods satisfy the following conditions. (Call of Duty Games)
interface CallOfDutyGame {
    // At least one method should have a non-void return type.
    double getGameRating();

    // At least one method should have minimum one parameter.
    void playGame(String playerName);
}
```

## Problem 3: Concrete Subclass

```java
// Create a concrete subclass of the abstract class created in Problem 1.
class GraphicsCard extends PCComponent {
    private int VRAM;  // Additional instance variable for GraphicsCard

    public GraphicsCard(String componentName, double price, int VRAM) {
        super(componentName, price);
        this.VRAM = VRAM;
    }

    // Implement the abstract method from the parent class.
    @Override
    public void upgradeComponent() {
        System.out.println("Upgrading " + componentName + " with more VRAM.");
        VRAM += 4; // Simulate a VRAM upgrade
        price += 100; // Increase price for the upgrade
    }

    // Additional method specific to GraphicsCard
    public void overclock() {
        System.out.println("Overclocking " + componentName + " for better performance.");
    }
}
```

## Problem 4: Concrete Class Implementing Interface

```java
// Create a concrete class implementing the interface created in Problem 2.
class CallOfDutyModernWarfare implements CallOfDutyGame {
    private double rating;

    public CallOfDutyModernWarfare(double rating) {
        this.rating = rating;
    }

    // Implement the methods from the interface.
    @Override
    public double getGameRating() {
        return rating;
    }

    @Override
    public void playGame(String playerName) {
        System.out.println(playerName + " is playing Call of Duty: Modern Warfare.");
    }
}
```

## Problem 5: Concrete Class Inheriting and Implementing

```java
// Create a concrete class that inherits the abstract class from Problem 1
// and also implements the interface from Problem 2.
class GamingPC extends PCComponent implements CallOfDutyGame {
    private String PCName;

    public GamingPC(String componentName, double price, String PCName) {
        super(componentName, price);
        this.PCName = PCName;
    }

    // Implement the abstract method from the parent class.
    @Override
    public void upgradeComponent() {
        System.out.println("Upgrading " + componentName + " for gaming performance.");
        price += 500; // Increase price for the gaming upgrade
    }

    // Implement the methods from the interface.
    @Override
    public double getGameRating() {
        return 4.5; // A default rating for the gaming PC
    }

    @Override
    public void playGame(String playerName) {
        System.out.println(playerName + " is playing games on " + PCName);
    }

    // Additional method specific to GamingPC
    public void overclockCPU() {
        System.out.println("Overclocking the CPU for better gaming performance.");
    }
}
```