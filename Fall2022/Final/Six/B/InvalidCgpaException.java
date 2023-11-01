package Fall2022.Final.Six.B;

public class InvalidCgpaException extends Exception {
    // Constructor that sets the exception message
    public InvalidCgpaException(double minCgpa, double maxCgpa) {
        super("Valid CGPA should be between " + minCgpa + " and " + maxCgpa);
    }
}
