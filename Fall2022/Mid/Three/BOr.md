# b. What will be output of the code below? Explain your steps in details.

```java
public class Patient {
    String name, gender;
    private int age;

    public Patient(String n, int a, String g) {
        this.name = n;
        this.age = a;
        this.gender = g;
    }

    public void grow(int year) {
        age += year;
    }

    public void visitDoctor(String symptom) {
        display();
        System.out.println("Visiting a doctor with following symptom: ");
        System.out.println(symptom);
    }

    public void display() {
        System.out.println(name + ":" + age + ":" + gender);
    }
}
```

In the `Patient` class, we have defined a constructor, some methods for modifying and displaying patient information.

```java
public class TestPatient {
    public static void main(String[] args) {
        Patient pat = new Patient("Hasin", 22, "M");
        pat.display();

        fun(pat);
        pat.visitDoctor("Fever and Cough");
    }

    public static void fun(Patient p) {
        p.grow(3);
        p.name = "Md. " + p.name;

        p = new Patient("Abrar", 19, "M");
        p.grow(1);
    }
}
```

In the `TestPatient` class, we are creating a `Patient` object, calling the `fun()` method on that object, and then calling the `visitDoctor()` method.

**Output Explanation:**

1. A `Patient` object named `pat` is created with the name "Hasin", age 22, and gender "M".
2. `pat.display()` is called, and it displays: "Hasin:22:M".

Now, let's look at the `fun()` method:

1. In the `fun()` method, we call `p.grow(3)`, which increases the age of the `pat` object by 3, making the age 25.
2. We set `p.name` to "Md. Hasin".
3. We create a new `Patient` object named `p` with the name "Abrar", age 19, and gender "M". However, note that this `p` is local to the `fun()` method and doesn't affect the `pat` object created in the `main()` method.
4. We call `p.grow(1)` again, increasing the age of the local `p` object by 1, making the age 20.

Back in the `main()` method:

1. `pat.visitDoctor("Fever and Cough")` is called, which first calls `display()` on the `pat` object, displaying: "Md. Hasin:25:M".
2. It then prints the doctor visit message.

**Output:**

```
Hasin:22:M
Md. Hasin:25:M
Visiting a doctor with following symptom: 
Fever and Cough
```

So, the output is as explained above.