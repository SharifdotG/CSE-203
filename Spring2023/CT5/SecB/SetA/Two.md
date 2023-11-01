To serialize objects of the `Student` class, you need to implement the `Serializable` interface. This interface does not have any methods and acts as a marker interface to indicate that the class can be serialized. Here's how you can modify the `Student` class to make it serializable:

```java
import java.io.Serializable;

public class Student implements Serializable {
    String name;
    int id;
    double cgpa;

    public Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return String.format("%s:%d:%.2f", name, id, cgpa);
    }
}
```

By implementing the `Serializable` interface, objects of the `Student` class can now be serialized and deserialized using Java's Object Serialization mechanism. This allows you to save `Student` objects to a file and later read them back as needed. Remember that all fields within the class must also be serializable, or marked as `transient` if they should not be serialized. In this case, the `String`, `int`, and `double` fields are serializable, so no further modifications are necessary.