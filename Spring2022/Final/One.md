## a) Object Oriented Programming

Object-Oriented Programming (OOP) is a programming paradigm that organizes data and behavior into reusable units called objects. Here are some key concepts in OOP:

- **Classes**: Classes are blueprints for creating objects. They define the attributes (data) and methods (functions) that objects of that class will have.

- **Objects**: Objects are instances of classes. They encapsulate data and behavior, allowing you to model real-world entities in code.

- **Encapsulation**: Encapsulation is the practice of hiding the internal details of an object and exposing a controlled interface. It helps in data security and maintains a clean interface for interacting with the object.

- **Inheritance**: Inheritance allows one class (subclass or derived class) to inherit properties and methods from another class (superclass or base class). It promotes code reuse and establishes an "is-a" relationship between classes.

- **Polymorphism**: Polymorphism allows objects of different classes to be treated as objects of a common base class. It enables method overriding and dynamic dispatch, improving code flexibility.

- **Abstraction**: Abstraction is the process of simplifying complex reality by modeling classes based on the essential properties and behaviors. It helps in managing complexity and focusing on what's important.

## b) Inheritance

Inheritance is a fundamental concept in Object-Oriented Programming (OOP) that allows a new class to inherit properties and behaviors from an existing class. Here are key points about inheritance:

- **Superclass/Base Class**: The class from which properties and methods are inherited is called the superclass or base class.

- **Subclass/Derived Class**: The class that inherits from the superclass is called the subclass or derived class.

- **"Is-a" Relationship**: Inheritance establishes an "is-a" relationship between the superclass and subclass. For example, if you have a superclass `Animal` and a subclass `Dog`, you can say that "Dog is an Animal."

- **Code Reusability**: Inheritance promotes code reuse, as you can create a new class that inherits features from an existing class, reducing duplication.

- **Method Overriding**: Subclasses can override methods inherited from the superclass, providing their own implementation. This allows customization of behavior.

- **Access to Superclass Members**: Subclasses can access public and protected members of the superclass. Private members are not directly accessible.

## c) Thread Life Cycle

Thread life cycle refers to the various states a thread can be in during its execution. In Java, threads are objects that execute concurrently within a program. The thread life cycle consists of the following states:

1. **New**: In this state, a thread is created but not yet started. The `Thread` object is instantiated, but the `start()` method hasn't been called.

2. **Runnable**: When the `start()` method is invoked, the thread enters the runnable state. It's ready to run but may not be currently executing due to CPU scheduling.

3. **Running**: In this state, the thread is executing its task and actively using CPU resources.

4. **Blocked/Waiting**: A thread can enter this state when it's waiting for a resource or condition to be met. It's not actively using CPU resources while blocked.

5. **Timed Waiting**: Threads can enter this state when they're waiting for a specific time duration to pass.

6. **Terminated**: When a thread has completed its task or explicitly terminated using the `stop()` method, it enters the terminated state and cannot be restarted.

These states represent the life cycle of a thread in a Java program, and they help manage concurrent execution and synchronization of tasks.