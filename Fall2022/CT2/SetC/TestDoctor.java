package Fall2022.CT2.SetC;

public class TestDoctor {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Sharif Md. Yousuf", "Child Specialist", 2);

        myDoctor.prescribe("Tareq", "Ace");

        myDoctor.display();
    }
}

/*
 * Output:
 * Sharif Md .Yousuf prescribes Ace to Tareq.
 * Name: Sharif Md .Yousuf
 * Specialty: Child Specialist
 * Rank: 3
 */