package Spring2022.Mid.One;

public class ICPCCoach {
    public String name;
    public String country;
    public int teamCount;

    public ICPCCoach(String name, String country, int teamCount) {
        this.name = name;
        this.country = country;
        this.teamCount = teamCount;
    }

    public void promoteTeam(String teamName) {
        teamCount++;
        System.out.println(teamName + " under " + name + " has been promoted for Final contest.");
    }

    public int getTeamCount() {
        return teamCount;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Team Count: " + teamCount);
    }
}