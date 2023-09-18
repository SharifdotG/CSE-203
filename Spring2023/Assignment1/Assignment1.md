# CSE 203: Java Assignment #1

---

### Problem 1:
**Abstract Class**

```java
// Define an abstract class with at least one abstract method.
abstract class AvengersCharacter {
    // Has at least 2 instance variables.
    String name;
    int powerLevel;
    
    // Parameterized constructor.
    public AvengersCharacter(String name, int powerLevel) {
        this.name = name;
        this.powerLevel = powerLevel;
    }
    
    // Has at least one instance/complete method.
    public void displayCharacterInfo() {
        System.out.println("Name: " + name);
        System.out.println("Power Level: " + powerLevel);
    }
    
    // Has at least one abstract method.
    public abstract void specialAbility();
}
```

### Problem 2:
**Interface**

```java
// Define an interface with at least two abstract methods.
interface GamingPCConfig {
    // At least one method should have a non-void return type.
    double calculatePerformanceScore();
    
    // At least one method should have a minimum of one parameter.
    void upgradeComponent(String componentName);
}
```

### Problem 3:
**Concrete Subclass**

```java
// Create a concrete subclass of the abstract class from Problem 1.
class IronMan extends AvengersCharacter {
    public IronMan(String name, int powerLevel) {
        super(name, powerLevel);
    }
    
    // Implementing the abstract method from the abstract class.
    @Override
    public void specialAbility() {
        System.out.println(name + " can fly using his Iron Man suit.");
    }
}
```

### Problem 4:
**Concrete Class Implementing Interface**

```java
// Create a concrete class implementing the interface from Problem 2.
class GamingComputer implements GamingPCConfig {
    private double performanceScore;
    
    @Override
    public double calculatePerformanceScore() {
        // Define how to calculate the performance score based on CPU speed and GPU memory.
        // You can use any formula or criteria that make sense for your assignment.
        
        // Example: A simple formula combining CPU speed and GPU memory.
        double performanceScore = cpuSpeed * 2 + gpuMemory * 5;
        
        return performanceScore;
    }

    @Override
    public void upgradeComponent(String componentName) {
        // Implement the component upgrade logic here.
        System.out.println("Upgrading " + componentName + " for the gaming PC...");
        
        // You can add your upgrade logic based on the component name.
        if (componentName.equals("CPU")) {
            // Upgrade the CPU.
            cpuSpeed += 0.5;  // Example: Increase CPU speed by 0.5 GHz.
        } else if (componentName.equals("GPU")) {
            // Upgrade the GPU.
            gpuMemory += 2;  // Example: Increase GPU memory by 2 GB.
        } else {
            System.out.println("Invalid component name. Upgrade failed.");
            return;
        }
        
        // Display the upgraded components.
        System.out.println(componentName + " upgraded successfully!");
        System.out.println("New CPU Speed: " + cpuSpeed + " GHz");
        System.out.println("New GPU Memory: " + gpuMemory + " GB");
    }
}
```

### Problem 5:
**Concrete Class Inheriting and Implementing**

```java
// Create a concrete class that inherits the abstract class from Problem 1
// and also implements the interface from Problem 2.
class Thor extends AvengersCharacter implements GamingPCConfig {
    private double cpuSpeed;  // CPU speed in GHz
    private int gpuMemory;    // GPU memory in GB

    public Thor(String name, int powerLevel, double cpuSpeed, int gpuMemory) {
        super(name, powerLevel);
        this.cpuSpeed = cpuSpeed;
        this.gpuMemory = gpuMemory;
    }

    // Implementing the abstract method from the abstract class.
    @Override
    public void specialAbility() {
        System.out.println(name + " can summon thunder with his mighty hammer.");
    }

    // Implementing methods from the interface.

    @Override
    public double calculatePerformanceScore() {
        // Define how to calculate the performance score for Thor's gaming PC.
        // You can use any formula that makes sense for your assignment.
        // Here, we calculate it based on CPU speed and GPU memory.
        return (cpuSpeed * 2) + (gpuMemory * 5);
    }

    @Override
    public void upgradeComponent(String componentName) {
        // Implement the component upgrade logic for Thor's gaming PC here.
        System.out.println("Upgrading " + componentName + " for Thor's gaming PC...");

        if (componentName.equals("CPU")) {
            // Upgrade the CPU for Thor's gaming PC.
            cpuSpeed += 0.5;  // Example: Increase CPU speed by 0.5 GHz.
        } else if (componentName.equals("GPU")) {
            // Upgrade the GPU for Thor's gaming PC.
            gpuMemory += 2;  // Example: Increase GPU memory by 2 GB.
        } else {
            System.out.println("Invalid component name. Upgrade failed.");
            return;
        }

        // Display the upgraded components for Thor's gaming PC.
        System.out.println(componentName + " upgraded successfully for Thor's gaming PC!");
        System.out.println("New CPU Speed: " + cpuSpeed + " GHz");
        System.out.println("New GPU Memory: " + gpuMemory + " GB");
    }
}
```