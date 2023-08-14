package Fall2022.CT2.SetC;

public class TestDoctor {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Your Name", "Child Specialist", 2);

        myDoctor.prescribe("Tareq", "Ace");

        myDoctor.display();
    }
}
/*
 * Output:
 * Your Name prescribes Ace to Tareq.
 * Name: Your Name
 * Specialty: Child Specialist
 * Rank: 3
 */