package Four.B.mid;

public class FindError {
    public static void main(String[] args) {
        MidExam m1 = new MidExam(10, 100);
        m1.addScore(10);

        System.out.println(m1.noOfQ);
        System.out.println(MidExam.tScore);
        System.out.println(MidExam.semester);
    }
}
