package Spring2023.CT2.SecC.SetB;

public class Course {
    public static void main(String[] args) {
        // Create an object of ClassTest for ct1
        ClassTest ct1 = new ClassTest("Sharif", 17, 3, 20);

        // Create an object of ClassTest for ct2
        ClassTest ct2 = new ClassTest("Yousuf", 10, 4, 20);

        // Call the addQuestion method for ct1 with the calculated mark
        ct1.addQuestion(3 + 28 % 13);

        // Call the display method for ct1 and ct2
        ct1.display();
        ct2.display();
    }
}

