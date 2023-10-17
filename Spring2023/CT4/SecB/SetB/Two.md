```java
public class TestException {
    public static void main(String[] args) {
        try {
            System.out.println("Inside Try.");
            int[] a = {1, 2, 3, 4};
            int i = a[4];
            System.out.println("Output: " + i);
        } catch (NumberFormatException e) {
            System.out.println("Inside Catch 1.");
        } catch (NullPointerException e) {
            System.out.println("Inside Catch 2.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inside Catch 3.");
        } finally {
            System.out.println("Inside Finally");
            System.out.println("Done.");
        }
    }
}
```

The code you provided will result in a runtime exception, specifically an `ArrayIndexOutOfBoundsException`, because it tries to access an element in the array `a` at index 4, which is out of bounds for the array. 

Here's the step-by-step explanation of the code execution:

1. The program enters the `try` block and prints "Inside Try."

2. It attempts to access the element at index 4 in the array `a`. However, the array only has elements at indices 0, 1, 2, and 3. This results in an `ArrayIndexOutOfBoundsException`.

3. Since the exception matches the `catch` block for `ArrayIndexOutOfBoundsException`, the program jumps to this catch block, prints "Inside Catch 3," and continues with the `finally` block.

4. The `finally` block always executes, so "Inside Finally" and "Done." are printed.

So, the output of this code will be as follows:

```
Inside Try.
Inside Catch 3.
Inside Finally
Done.
```

There are no exceptions for `NumberFormatException` or `NullPointerException` thrown in this code, so their respective catch blocks are not executed.