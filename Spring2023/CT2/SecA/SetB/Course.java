package Spring2023.CT2.SecA.SetB;

public class Course {
    private String title;
    private int credit;
    private int noOfStudents;

    // Parameterized constructor
    public Course(String title, int credit, int noOfStudents) {
        this.title = title;
        this.credit = credit;
        this.noOfStudents = noOfStudents;
    }

    // Method to register students
    public void registerCourse(int studentCount) {
        noOfStudents += studentCount;
    }

    // Method to drop a student
    public void dropCourse() {
        noOfStudents--;
    }

    // Method to get the student count
    public int getStudentCount() {
        return noOfStudents;
    }

    // Method to display attributes
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Credit: " + credit);
        System.out.println("Number of Students: " + noOfStudents);
    }
}


