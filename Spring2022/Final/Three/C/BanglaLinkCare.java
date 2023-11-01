package Spring2022.Final.Three.C;

public class BanglaLinkCare implements CustomerCare {
    @Override
    public void welcomeMsg() {
        System.out.println("Welcome to Bangla Link customer care.");
    }

    @Override
    public void sayBye() {
        System.out.println("Have a nice day.");
    }
}
