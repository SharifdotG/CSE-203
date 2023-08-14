package Fall2022.CT2.SetC;

public class Doctor {
    private String name;
    private String specialty;
    private int rank;

    public Doctor(String name, String specialty, int rank) {
        this.name = name;
        this.specialty = specialty;
        this.rank = rank;
    }

    public void prescribe(String patient, String med) {
        System.out.println(name + " prescribes " + med + " to " + patient + ".");
        rank++;
    }

    public int getRank() {
        return rank;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Specialty: " + specialty);
        System.out.println("Rank: " + rank);
    }

    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Smith", "Cardiologist", 3);

        doctor.prescribe("John", "Aspirin");

        doctor.display();
    }
}

