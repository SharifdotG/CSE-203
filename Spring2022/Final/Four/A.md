**Errors:**

1. In the `Calculator` class, there is a method overloading error because both `sum` methods have the same method signature (same method name and parameter types). Java does not allow two methods with the same signature in the same class.

2. In the `FindError` class, the variables `a` and `b` are declared outside of any method, which makes them instance variables. However, the `main` method is a static method, and it cannot access instance variables without an instance of the class.

**Fixed Code:**

```java
public class Calculator {
    public void printSum(int a, int b) {
        System.out.println(a + b);
    }

    public int calculateSum(int a, int b) {
        return a + b;
    }
}

public class FindError {
    static int a = 5;
    static int b = 7;

    public static void main(String[] args) {
        int sum = a + b;
        System.out.println(sum);
    }
}
```

**Changes Made:**

1. Renamed the `sum` method in the `Calculator` class to `printSum` to avoid method overloading error.

2. Changed the name of the other `sum` method in the `Calculator` class to `calculateSum` to avoid method overloading error.

3. Made the variables `a` and `b` in the `FindError` class static, so they can be accessed in the static `main` method without creating an instance of the class.
