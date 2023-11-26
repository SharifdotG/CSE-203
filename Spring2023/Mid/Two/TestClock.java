package Spring2023.Mid.Two;

public class TestClock {
    public static void main(String[] args) {
        Clock myClock = new Clock(11, 22, 28);

        myClock.addSeconds(100);

        System.out.println(myClock.getTime());
    }
}
