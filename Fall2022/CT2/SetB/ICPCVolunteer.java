package Fall2022.CT2.SetB;

public class ICPCVolunteer {
    private String name;
    private String role;
    private int rank;

    public ICPCVolunteer(String name, String role, int rank) {
        this.name = name;
        this.role = role;
        this.rank = rank;
    }

    public void getTraining(String trainingName, int score) {
        rank += score;
        System.out.println(name + " attended " + trainingName + " training.");
    }

    public int getRank() {
        return rank;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Rank: " + rank);
    }
}

