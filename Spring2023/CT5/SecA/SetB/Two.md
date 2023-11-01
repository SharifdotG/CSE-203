To serialize the objects of the `Doctor` class but exclude the `age` attribute from serialization, you can use Java's serialization mechanism and the `transient` keyword. Here are the changes you need to make in the `Doctor` class:

```java
package ct5.secA;

import java.io.Serializable;

public class Doctor implements Serializable {
    String name, expertise;
    transient int age; // Use the transient keyword to exclude 'age' from serialization

    public Doctor(String name, String expertise, int age) {
        this.name = name;
        this.expertise = expertise;
        this.age = age;
    }
}
```

In the code above, we make the following changes:

1. Import `java.io.Serializable` to indicate that the `Doctor` class can be serialized.

2. Mark the `age` attribute as `transient`. This keyword tells the Java serialization mechanism to exclude the `age` attribute from serialization. This means that when you serialize a `Doctor` object, the `age` attribute won't be included in the serialized data.

With these changes, you can now serialize and deserialize `Doctor` objects while excluding the `age` attribute from the serialized data.