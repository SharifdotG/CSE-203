package Spring2022.Mid.Four.A.Mid;

public class MidExam {
    private int noOfQuest;
    double score, totalScore;
    static String semester = "2-1";

    public MidExam(int noOfQuestion, double totalScore, double score) {
        this.noOfQuest = noOfQuestion;
        this.totalScore = totalScore;
        this.score = score;
    }

    public void addScore(double score) {
        if (this.score + score <= totalScore) {
            this.score += score;
        } else {
            System.out.println("Invalid score");
        }
    }

    public void display() {
        String d = String.format("%s - %d - %.1f - %.1f", semester, noOfQuest, totalScore, score);
        System.out.println(d);
    }
}