# a. Identify the errors in the code below and fix the errors. You are not allowed to delete any line of code. You can only add new line or edit existing line.

```java
// Patient.java
package mid;
public class Patient {
    public String name, gender;
    private int age;

    public Patient(String n, int a, String g)
    {
        this.name = n;
        this.age = a;
        this.gender = g;
    }

    public int getAge() {
        return age;
    }

    public void display(){
        System.out.print(name+": "+age+":"+gender);
    }
}

// TestError.java (in mid.error package)
package mid.error;
public class TestError {
    public static void main(String[] a) {
        Patient pat = new Patient ("Abir", 20);  // Error: Constructor call is missing the 'gender' argument.
        System.out.println(pat.name);
        System.out.println(pat.age);  // Error: 'age' has private access in 'mid.Patient'.
        System.out.println(pat.gender);
    }
}
```

Here's the fixed code with explanations:

```java
// Patient.java (no changes needed)
package mid;
public class Patient {
    public String name, gender;
    private int age;

    public Patient(String n, int a, String g)
    {
        this.name = n;
        this.age = a;
        this.gender = g;
    }

    public int getAge() {
        return age;
    }

    public void display(){
        System.out.print(name+": "+age+":"+gender);
    }
}

// TestError.java (in mid.error package)
package mid.error;
import mid.Patient;  // Add an import statement to use the Patient class from the 'mid' package.

public class TestError {
    public static void main(String[] a) {
        Patient pat = new Patient("Abir", 20, "Male");  // Add the 'gender' argument.
        System.out.println(pat.name);
        // System.out.println(pat.age);  // Commented out due to private access.
        System.out.println(pat.getAge());  // Use the getAge() method to access 'age'.
        System.out.println(pat.gender);
    }
}
```

Changes made to fix the errors:

1. In the `TestError` class, added an import statement to import the `Patient` class from the `mid` package.
2. In the constructor call for `Patient`, added the missing 'gender' argument.
3. Replaced the direct access to `pat.age` with a call to the `getAge()` method.
4. The rest of the code remains unchanged.