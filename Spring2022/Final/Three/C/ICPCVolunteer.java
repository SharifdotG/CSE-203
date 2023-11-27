package Spring2022.Final.Three.C;

public class ICPCVolunteer implements CustomerCare {
    @Override
    public void welcomeMsg() {
        System.out.println("Welcome to ICPC World Final 2021.");
    }

    @Override
    public void sayBye() {
        System.out.println("Hope you enjoyed the final.");
    }
}
