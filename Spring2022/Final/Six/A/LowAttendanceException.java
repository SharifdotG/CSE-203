package Spring2022.Final.Six.A;

public class LowAttendanceException extends Exception {
    public LowAttendanceException(int minAtt) {
        super("Need a minimum attendance of " + minAtt + " days to attend the final exam");
    }
}
