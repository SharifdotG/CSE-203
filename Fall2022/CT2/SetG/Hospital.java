package Fall2022.CT2.SetG;

public class Hospital {
    public static void main(String[] args) {
        Physician myPhys = new Physician("Sharif Md. Yousuf", "Child Specialist", 28);

        myPhys.meetPatient("Tareq", "Ace");

        myPhys.display();
    }
}

/*
 * Output:
 * Sharif Md. Yousuf prescribes Ace to Tareq.
 * Name: Sharif Md. Yousuf
 * Specialty: Child Specialist
 * Rank: 29
 */