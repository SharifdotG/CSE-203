package Spring2022.Mid.Four.A.Mid;

public class FindOutput {
    public static void main(String[] args) {
        MidExam a = new MidExam(5, 100, 10);
        MidExam b = new MidExam(5, 80, 20);
        a.addScore(5);

        midFun(a, b);
        a.display();
        b.display();
    }

    public static void midFun(MidExam m1, MidExam m2) {
        m1.totalScore = m2.totalScore;
        m2 = new MidExam(5, 60, 30);
        m2.semester = "2-2";
        m2.score = m1.score;
    }
}
