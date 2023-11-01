package Spring2023.CT5.SecB.SetA.One;

public class Student {
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