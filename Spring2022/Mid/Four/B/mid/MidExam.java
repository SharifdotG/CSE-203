package Four.B.mid;

public class MidExam {
    private int noOfQ;
    double score, tScore;
    public static String semester = "2-1";

    public MidExam(int noOfQuestion, double totalScore, double score) {
        this.noOfQ = noOfQuestion;
        this.tScore = totalScore;
        this.score = score;
    }

    public void addScore(double score) {
        if (this.score + score <= tScore) {
            this.score += score;
        } else {
            System.out.println("Invalid score");
        }
    }

    public void display() {
        String d = String.format("%s - %d - %.1f - %.1f", semester, noOfQ, tScore, score);
        System.out.println(d);
    }
}
