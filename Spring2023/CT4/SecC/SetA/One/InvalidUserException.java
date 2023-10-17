package Spring2023.CT4.SecC.SetA.One;

public class InvalidUserException extends Exception {
    private String message;

    public InvalidUserException(String id, String userType) {
        super();
        this.message = id + " is not a a valid " + userType;
    }

    public InvalidUserException(String id) {
        super();
        this.message = id + " is not a valid user.";
    }

    @Override
    public String getMessage() {
        return message;
    }
}