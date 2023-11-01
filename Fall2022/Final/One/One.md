# Question 1:

## a. Java Identifier Rules with Examples

In Java, identifiers are names given to classes, variables, methods, and labels. They follow certain rules:

1. **Must begin with a letter, currency character (\$), or underscore (_)**
   - Valid: `variable`, `$value`, `_count`
   - Invalid: `123number`, `@symbol`

2. **After the first character, identifiers can also contain digits**
   - Valid: `variable123`, `value_1`
   - Invalid: `123variable`, `1value`

3. **No spaces or special characters are allowed except for currency character ($) and underscore (_)**
   - Valid: `total_amount`, `user$ID`
   - Invalid: `user ID`, `@username`

4. **Identifiers are case-sensitive**
   - `variableName` and `variablename` are different identifiers.

5. **Cannot be a Java keyword**
   - Invalid: `int`, `public`, `class`

## b. Major Difference between Java Arrays and C/C++ Arrays

The major differences between Java arrays and C/C++ arrays are:

- **Dynamic Sizing:** In Java, arrays are dynamically sized objects. Once an array is created, its size cannot be changed. In C/C++, you can dynamically allocate or resize arrays using functions like `malloc()` or `realloc()`.

- **Bounds Checking:** Java performs automatic bounds checking, preventing the program from accessing elements outside the array's bounds. In C/C++, accessing elements beyond the array's boundary leads to undefined behavior.

- **Objects vs. Pointers:** In Java, arrays are objects, which means they inherit properties and methods from the Object class. In C/C++, arrays are essentially pointers to memory locations.

- **Type Safety:** Java arrays are type-safe, meaning they store elements of a specific data type. In C/C++, arrays can hold elements of different data types within the same array, which can lead to type-related issues.

## c. Java Garbage Collection with Examples

Java's garbage collection is a process by which Java programs perform automatic memory management. It identifies and deletes objects that are no longer reachable, freeing up memory. Here's an example to illustrate how garbage collection works:

```java
class Example {
    public static void main(String[] args) {
        // Creating objects
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        
        // Assigning obj1 reference to obj2, making obj2 unreachable
        obj2 = obj1;
        
        // Making obj1 null, making both objects unreachable
        obj1 = null;
        
        // At this point, both objects are unreachable and eligible for garbage collection
        // Java's garbage collector will automatically reclaim the memory occupied by obj1 and obj2
    }
}

class MyClass {
    // Class definition
}
```

In this example, `obj1` and `obj2` are references to objects of the `MyClass` class. When `obj2` is assigned the reference of `obj1`, the original reference to the second object is lost, making it unreachable. Setting `obj1` to `null` makes both objects unreachable, and they are eligible for garbage collection. The Java Virtual Machine (JVM) will automatically identify these unreachable objects and release their memory resources.