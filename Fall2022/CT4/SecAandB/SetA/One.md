In Java, user-defined exceptions are typically created by extending the `Exception` class or one of its subclasses. So, let's evaluate each option:

a) `class MyException implements Exception`
   This is not a valid header for a user-defined exception. User-defined exceptions should extend a class that is part of the exception hierarchy, not implement an interface like `Exception`.

b) `class MyException extends Exception`
   This is a valid header for a user-defined exception. By extending the `Exception` class, you create a custom exception class.

c) `public class MyException extends ArithmeticException`
   This is a valid header for a user-defined exception. You can extend a specific subclass of `Exception` like `ArithmeticException` to create a custom exception class.

d) `public class MyException implements Throwable`
   This is not a valid header for a user-defined exception. User-defined exceptions should extend classes within the exception hierarchy, not implement the `Throwable` interface.

So, the valid headers for user-defined exceptions are (b) and (c).