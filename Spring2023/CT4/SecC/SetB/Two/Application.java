package Spring2023.CT4.SecC.SetB.Two;

public class Application {
    public static void main(String[] args) {
        try {
            int applicantAge = 25;
            checkEligibility(applicantAge);
        } catch (InvalidApplicantException e) {
            System.out.println("Invalid Applicant: " + e.getMessage());
        }
    }

    public static void checkEligibility(int age) throws InvalidApplicantException {
        int minAge = 18;
        int maxAge = 30;

        if (age < minAge || age > maxAge) {
            throw new InvalidApplicantException(minAge, maxAge);
        } else {
            System.out.println("Applicant is eligible!");
        }
    }
}

class InvalidApplicantException extends Exception {
    public InvalidApplicantException(int min, int max) {
        super("Applicants who are between " + min + " and " + max + " years old are eligible for this position.");
    }

    public InvalidApplicantException(String minQualification) {
        super("Applicant must have a " + minQualification + " degree or higher to be eligible for this position.");
    }
}
