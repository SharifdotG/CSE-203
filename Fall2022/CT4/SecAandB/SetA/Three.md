In Java, when you use the `throw` statement to throw a checked exception like `Exception`, you must either declare that the method throws the exception using the `throws` clause or catch the exception using a `try-catch` block. Here's the fixed code with the necessary changes:

```java
package ct4;

public class TestException {
    public static void main(String[] args) {
        try {
            validData(10);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void validData(int data) throws Exception {
        if (data > 0 && data < 100)
            System.out.println(data);
        else
            throw new Exception("Should be between 0 and 100"); // Line 11
    }
}
```

In the fixed code:

1. I added a `try-catch` block around the `validData(10)` method call in the `main` method to catch the exception that may be thrown.

2. I added the `throws Exception` declaration to the `validData` method signature to indicate that this method can throw an `Exception`. This is necessary because `Exception` is a checked exception.

3. I modified the error message in the `throw` statement to "Should be between 0 and 100" to fix the typo in your original code.