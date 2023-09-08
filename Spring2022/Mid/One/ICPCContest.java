package One;

public class ICPCContest {
    public static void main(String[] args) {
        ICPCCoach coach = new ICPCCoach("Sharif Md. Yousuf", "Bangladesh", 2); // Swap "Sharif Md. Yousuf" with your own name

        coach.promoteTeam("UAP Fighter");

        coach.display();
    }
}

/* 
 * Output:
 * 
 * UAP Fighter under Sharif Md. Yousuf has been promoted for Final contest.
 * Name: Sharif Md. Yousuf
 * Country: Bangladesh
 * Team Count: 3
 */


