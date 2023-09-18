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
        // Define how to calculate the performance score.
        return performanceScore;
    }
    
    @Override
    public void upgradeComponent(String componentName) {
        // Implement the component upgrade logic here.
    }
}
```

### Problem 5:
**Concrete Class Inheriting and Implementing**

```java
// Create a concrete class that inherits the abstract class from Problem 1
// and also implements the interface from Problem 2.
class Thor extends AvengersCharacter implements GamingPCConfig {
    public Thor(String name, int powerLevel) {
        super(name, powerLevel);
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
        return 0.0;
    }
    
    @Override
    public void upgradeComponent(String componentName) {
        // Implement the component upgrade logic for Thor's gaming PC here.
    }
}
```