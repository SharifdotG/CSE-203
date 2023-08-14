package Fall2022.CT2.SetD;

public class ICPCTeam {
    private String coachName;
    private int memberCount;
    private int noOfProbSolved;

    public ICPCTeam(String coachName, int memberCount) {
        this.coachName = coachName;
        this.memberCount = memberCount;
        this.noOfProbSolved = 0;
    }

    public void solveProblems(int count) {
        noOfProbSolved += count;
    }

    public int getNoOfProblemSolved() {
        return noOfProbSolved;
    }

    public void display() {
        System.out.println("Coach Name: " + coachName);
        System.out.println("Member Count: " + memberCount);
        System.out.println("Number of Problems Solved: " + noOfProbSolved);
    }
}