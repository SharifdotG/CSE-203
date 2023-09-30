package Fall2022.CT5.SecC.SetB.One;

public class CT5_OuterClass {
    String ctName;
    int mark = 20;

    class QuizInner {
        int mark = 10;

        public void printMarks(int mark) {
            // Print the mark instance variable of CT5_OuterClass
            System.out.println("OuterClass mark: " + CT5_OuterClass.this.mark);

            // Print the mark instance variable of QuizInner
            System.out.println("InnerClass mark: " + this.mark);

            // Multiply the mark parameter with 3 and print the result
            int result = mark * 3;
            System.out.println("Multiplied mark: " + result);
        }
    }
}

