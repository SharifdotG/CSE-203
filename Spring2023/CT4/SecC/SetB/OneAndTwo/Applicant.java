package Spring2023.CT4.SecC.SetB.OneAndTwo;

public class Applicant {
    // Example method that throws InvalidApplicantException using 'throw' keyword
    public void processApplicant(int age, String qualification) throws InvalidApplicantException {
        if (age < 18 || age > 65) {
            throw new InvalidApplicantException(18, 65);
        }
        if (!qualification.equalsIgnoreCase("Bachelor's")) {
            throw new InvalidApplicantException("Bachelor's");
        }

        // Process applicant if eligible
        System.out.println("Applicant processed successfully.");
    }

    // Example method that declares it may throw InvalidApplicantException using 'throws' keyword
    public void processMultipleApplicants(int[] ages, String[] qualifications) throws InvalidApplicantException {
        for (int i = 0; i < ages.length; i++) {
            try {
                processApplicant(ages[i], qualifications[i]);
            } catch (InvalidApplicantException e) {
                // Handle the exception if needed
                System.out.println("Error processing applicant: " + e.getMessage());
            }
        }
    }

    // Main method to demonstrate the usage
    public static void main(String[] args) {
        Applicant processor = new Applicant();
        int[] ages = { 25, 70, 30 };
        String[] qualifications = { "Bachelor's", "Master's", "High School" };

        try {
            // Calling a method that uses 'throws' keyword
            processor.processMultipleApplicants(ages, qualifications);
        } catch (InvalidApplicantException e) {
            // Handle the exception if needed
            System.out.println("Error processing applicants: " + e.getMessage());
        }
    }
}