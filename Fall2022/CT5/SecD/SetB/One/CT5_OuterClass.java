package Fall2022.CT5.SecD.SetB.One;

public class CT5_OuterClass {
    String ctName;
    int mark = 20;

    public void display() {
        System.out.println(ctName);
        System.out.println(mark);
    }

    class QuizInner {
        int markInner = 10;

        public void printDetails() {
            display();
            System.out.println(markInner);
        }
    }
}

class TestNestedClass {
    public static void main(String[] args) {
        // Create the object of the QuizInner class in proper way
        // and assign to a variable name "inner"
        CT5_OuterClass outerObject = new CT5_OuterClass();
        CT5_OuterClass.QuizInner inner = outerObject.new QuizInner();

        // Call the printDetails() method using the "inner" variable.
        inner.printDetails();
    }
}
