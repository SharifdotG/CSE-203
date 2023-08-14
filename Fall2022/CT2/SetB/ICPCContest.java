package Fall2022.CT2.SetB;

public class ICPCContest {
    public static void main(String[] args) {
        ICPCVolunteer volunteer = new ICPCVolunteer("Your Name", "registration", 2);

        volunteer.getTraining("Meet and Greet", 3);

        volunteer.display();
    }
}
/*
 * Output:
 * Your Name attended Meet and Greet training.
 * Name: Your Name
 * Role: registration
 * Rank: 5
 */