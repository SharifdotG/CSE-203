package Spring2023.CT2.SecA.SetA;

public class ClassTest {
    private String name;
    private int score;
    private int noOfQuestions;

    // Parameterized constructor
    public ClassTest(String name, int score, int noOfQuestions) {
        this.name = name;
        this.score = score;
        this.noOfQuestions = noOfQuestions;
    }

    // Method to add a question
    public void addQuestion(int mark) {
        noOfQuestions++;
        score += mark;
    }

    // Method to get the question count
    public int getQuestionCount() {
        return noOfQuestions;
    }

    // Method to display attributes
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
        System.out.println("Number of Questions: " + noOfQuestions);
    }
}
