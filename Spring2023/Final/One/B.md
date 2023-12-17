# Differentiate between abstract classes and interfaces in Java

In Java, abstract classes and interfaces serve different purposes but both are used to achieve abstraction, allowing you to define methods without necessarily providing an implementation.

**Abstract Classes:**

- An abstract class is a class that cannot be instantiated on its own. It serves as a blueprint for other classes and can contain both abstract methods (methods without implementation) and concrete methods (methods with implementation).
- Abstract classes can have member variables, constructors, and defined methods.
- A class can extend only one abstract class due to Java's single inheritance rule.

Example:

```java
public abstract class Shape {
    // Abstract method
    public abstract double calculateArea();
    
    // Concrete method
    public void display() {
        System.out.println("This is a shape.");
    }
}
```

**Interfaces:**

- An interface in Java is a collection of abstract methods. It cannot contain any concrete method implementations.
- It allows a class to implement multiple interfaces, enabling a form of multiple inheritance in Java.
- All methods in an interface are by default public and abstract.

Example:

```java
public interface Drawable {
    // Abstract method
    void draw();
    
    // Another abstract method
    double calculateArea();
}
```

**Key Differences:**

1. **Implementation:** Abstract classes can have both abstract and concrete methods, while interfaces can only have abstract method declarations.
2. **Inheritance:** A class can extend only one abstract class, but it can implement multiple interfaces.
3. **Fields:** Abstract classes can have fields (member variables) that can be inherited by subclasses. Interfaces cannot contain fields.
4. **Accessibility:** Abstract class methods can have different access modifiers, while interface methods are by default public and abstract.

When to use which?

- Use an abstract class when you have a base class with some default behavior and you want to enforce some methods to be implemented by subclasses.
- Use an interface when you want to define a contract that multiple unrelated classes can implement, ensuring consistency in behavior across these classes.

Both concepts serve the purpose of abstraction in Java, but their usage depends on the specific design and requirements of your program.
