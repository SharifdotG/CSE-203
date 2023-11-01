package Fall2022.Final.Three;

public class Programmer extends Professional {
    int rank;
    
    public Programmer(String name, int age, String designation, double salary, int rank) {
        super(name, age, "ICT", designation, salary);
        this.rank = rank;
    }

    @Override
    public void jobDescription() {
        System.out.println("Do professional programming");
    }
}
