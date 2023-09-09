package Spring2023.CT2.SecA.SetB;

public class Spring23 {
    public static void main(String[] args) {
        // Create an object of Course class for "OOP" with credit 3 and initial students count 20
        Course course1 = new Course("OOP", 3, 20);

        // Create an object of Course class for "Data Structure" with credit 3 and initial students count 25
        Course course2 = new Course("Data Structure", 3, 25);

        // Replace '8' with the actual last digit of your registration number
        int lastDigit = 8;

        // Call the registerCourse method for course1 with the last digit of your registration number as the parameter
        course1.registerCourse(lastDigit);

        // Call the dropCourse method for course2
        course2.dropCourse();

        // Call the display method for both course1 and course2
        course1.display();
        course2.display();
    }
}

