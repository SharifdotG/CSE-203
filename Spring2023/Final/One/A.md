# Polymorphism is one of the key features of OOP. Explain how polymorphism can be achieved in Java

In Java, polymorphism allows objects of different classes to be treated as objects of a common superclass through inheritance. There are two main types of polymorphism in Java: compile-time polymorphism (achieved through method overloading and method overriding) and runtime polymorphism (achieved through method overriding and interface implementation).

1. **Method Overloading**: This is a form of compile-time polymorphism where multiple methods have the same name but different parameters within the same class. Java determines which method to execute based on the number and types of arguments passed during compile-time.

   ```java
   class Example {
       void display(int num) {
           System.out.println("Number: " + num);
       }

       void display(String text) {
           System.out.println("Text: " + text);
       }
   }
   ```

2. **Method Overriding**: This is a form of runtime polymorphism that occurs when a subclass provides a specific implementation of a method that is already defined in its superclass. It allows a subclass to provide its own implementation of a method defined in its superclass.

   ```java
   class Animal {
       void makeSound() {
           System.out.println("Animal makes a sound");
       }
   }

   class Dog extends Animal {
       @Override
       void makeSound() {
           System.out.println("Dog barks");
       }
   }
   ```

3. **Interface Implementation**: Java also achieves polymorphism through interfaces, where multiple classes can implement the same interface and provide their own implementation for the interface methods. This allows different objects to be treated uniformly through the interface type.

   ```java
   interface Shape {
       void draw();
   }

   class Circle implements Shape {
       @Override
       public void draw() {
           System.out.println("Drawing Circle");
       }
   }

   class Rectangle implements Shape {
       @Override
       public void draw() {
           System.out.println("Drawing Rectangle");
       }
   }
   ```

Polymorphism in Java allows for flexibility and extensibility in code by enabling the use of objects of different classes through a common interface or superclass. This flexibility is one of the key principles of Object-Oriented Programming.
