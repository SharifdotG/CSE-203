Code with errors:
```java
public class TestError {
    public static void main (String[] a) {
        Student stl = new Student ("Abir", "111", 3.5f);
        Student st2 = new Student ("Hasan", "111", 3.5f);
        System.out.println(stl);
    }
}

class Student {
    private String name, id;
    private float cgpa;
    public final static String univName = "UAP";
    public int studentCount = 0;

    public void Student(String name, String id, float cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        studentCount++;
    }

    public static void increaseStudentCount(int inc_amt) {
        studentCount += inc_amt;
    }

    public static void setUnivName(String newName) {
        univName = newName;
    }
}
```

Code without errors:
```java
public class TestError {
    public static void main (String[] a) {
        Student stl = new Student ("Abir", "111", 3.5f);
        Student st2 = new Student ("Hasan", "111", 3.5f);
        System.out.println(stl);
    }
}

class Student {
    private String name, id;
    private float cgpa;
    public static String univName = "UAP";
    public static int studentCount = 0;

    public Student(String name, String id, float cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        studentCount++;
    }

    public static void increaseStudentCount(int inc_amt) {
        studentCount += inc_amt;
    }

    public static void setUnivName(String newName) {
        univName = newName;
    }
}
```

Here are the explanations for the changes made:

1. In the `Student` constructor, I removed the `void` return type, as constructors don't have a return type.
2. Changed the `studentCount` variable to `static` to make it a class variable.
3. In the `setUnivName` method, I removed the `final` modifier to allow modification of `univName`.