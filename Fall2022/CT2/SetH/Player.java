package Fall2022.CT2.SetH;

public class Player {
    private String name;
    private String teamName;
    private int noOfMatchesPlayed;

    public Player(String name, String teamName, int noOfMatchesPlayed) {
        this.name = name;
        this.teamName = teamName;
        this.noOfMatchesPlayed = noOfMatchesPlayed;
    }

    public void playMatches(int count) {
        noOfMatchesPlayed += count;
    }

    public String getTeamName() {
        return teamName;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Team Name: " + teamName);
        System.out.println("Number of Matches Played: " + noOfMatchesPlayed);
    }
}