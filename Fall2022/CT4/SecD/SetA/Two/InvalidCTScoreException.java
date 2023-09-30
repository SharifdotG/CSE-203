package Fall2022.CT4.SecD.SetA.Two;

public class InvalidCTScoreException extends Exception {
    public InvalidCTScoreException(int mark) {
        super("You need a minimum score of " + mark + " in CT to attend the final exam.");
    }
}