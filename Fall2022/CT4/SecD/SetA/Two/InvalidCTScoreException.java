package Fall2022.CT4.SecD.SetA.Two;

// Define a custom exception class named InvalidCTScoreException that extends the built-in Exception class.
public class InvalidCTScoreException extends Exception {
    // Create a constructor that takes the cutoff CT score as a parameter.
    public InvalidCTScoreException(int mark) {
        // Call the constructor of the parent Exception class and set the exception message.
        super("You need a minimum score of " + mark + " in CT to attend the final exam.");
    }
}