package Fall2022.Final.Three;

public abstract class Professional {
    String name;
    int age;
    String specialty;
    String designation;
    double salary;
    
    public Professional(String name, int age, String speciality, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.specialty = speciality;
        this.designation = designation;
        this.salary = salary;
    }

    public void promotion(String newDesignation, double newSalary) {
        this.designation = newDesignation;
        this.salary = newSalary;
    }

    public abstract void jobDescription();

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Specialty: " + specialty;
    }
}
