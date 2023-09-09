package Spring2023.CT2.SecC.SetB;

public class ClassTest {
    private String name;
    private int score;
    private int noOfQuestions;
    private int maxScore;

    // Parameterized constructor
    public ClassTest(String name, int score, int noOfQuestions, int maxScore) {
        this.name = name;
        this.score = score;
        this.noOfQuestions = noOfQuestions;
        this.maxScore = maxScore;
    }

    // Method to add a question
    public void addQuestion(int mark) {
        noOfQuestions++;
        score += mark;

        // Check if score exceeds maxScore, then reset
        if (score > maxScore) {
            noOfQuestions = 0;
            score = 0;
        }
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
        System.out.println("Max Score: " + maxScore);
    }
}

