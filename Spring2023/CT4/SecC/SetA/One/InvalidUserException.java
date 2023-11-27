package Spring2023.CT4.SecC.SetA.One;

public class InvalidUserException extends Exception {
    public InvalidUserException(int id, String userType) {
        super(id + " is not a a valid " + userType);
    }

    public InvalidUserException(int id) {
        super(id + " is not a valid user.");
    }
}