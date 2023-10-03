package Fall2022.CT4.SecC.SetA.Two;

// Define a custom exception class named LowAttendanceScoreException that extends the built-in Exception class.
public class LowAttendanceScoreException extends Exception {
    // Create a constructor that takes the cutoff attendance as a parameter.
    public LowAttendanceScoreException(double cutOffAttendance) {
        // Call the constructor of the parent Exception class and set the exception message.
        super("You need a minimum attendance of " + cutOffAttendance + " to attend the Final Exam");
    }
}
