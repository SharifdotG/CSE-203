package Spring2023.CT4.SecC.SetB.One;

public class InvalidApplicantException extends Exception {
    public InvalidApplicantException(int min, int max) {
        super("Applicants who are between " + min + " and " + max + " years old are eligible for this position.");
    }

    public InvalidApplicantException(String minQualification) {
        super("Applicant must have a " + minQualification + " degree or higher to be eligible for this position.");
    }
}