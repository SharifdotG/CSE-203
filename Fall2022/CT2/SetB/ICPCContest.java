package Fall2022.CT2.SetB;

public class ICPCContest {
    public static void main(String[] args) {
        ICPCVolunteer volunteer = new ICPCVolunteer("Sharif Md. Yousuf", "registration", 2);

        volunteer.getTraining("Meet and Greet", 3);

        volunteer.display();
    }
}
/*
 * Output:
 * Sharif Md. Yousuf attended Meet and Greet training.
 * Name: Sharif Md. Yousuf
 * Role: registration
 * Rank: 5
 */