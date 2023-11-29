package Fall2022.Final.Six.B;

public class InvalidCgpaException extends Exception {
    public InvalidCgpaException(double minCgpa, double maxCgpa) {
        super("Valid CGPA should be between " + minCgpa + " and " + maxCgpa);
    }
}
