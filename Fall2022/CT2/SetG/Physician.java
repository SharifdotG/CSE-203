package Fall2022.CT2.SetG;

public class Physician {
    private String name;
    private String specialty;
    private int rank;

    public Physician(String name, String specialty, int rank) {
        this.name = name;
        this.specialty = specialty;
        this.rank = rank;
    }

    public void meetPatient(String patient, String med) {
        System.out.println(name + " prescribes " + med + " to " + patient + ".");
        rank++;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Specialty: " + specialty);
        System.out.println("Rank: " + rank);
    }
}