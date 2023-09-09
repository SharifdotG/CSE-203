package Spring2023.CT2.SecA.SetA;

public class Course {
    public static void main(String[] args) {
        // Create an object of ClassTest with your first name, score=15, and noOfQuestions=3
        ClassTest ct1 = new ClassTest("YourFirstName", 15, 3);

        // Create another object of ClassTest with your last name, score=10, and noOfQuestions=4
        ClassTest ct2 = new ClassTest("YourLastName", 10, 4);

        // Calculate the mark for ct1 based on your registration number (replace '28' with your actual registration number)
        int id = 28;
        int mark = 3 + id % 13;

        // Call the addQuestion method for ct1 with the calculated mark
        ct1.addQuestion(mark);

        // Call the display method for ct1 and ct2
        ct1.display();
        ct2.display();
    }
}
