package Spring2022.Final.Three.C;

public class TestCustomerCare {
    public static void main(String[] args) {
        CustomerCare bCare = new BanglaLinkCare();
        System.out.println("Bangla Link:");
        bCare.welcomeMsg();
        bCare.sayBye();

        CustomerCare iCare = new ICPCVolunteer();
        System.out.println("\nICPC World Final:");
        iCare.welcomeMsg();
        iCare.sayBye();
    }
}
