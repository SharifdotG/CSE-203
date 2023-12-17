package Spring2023.Final.Five.AB;

public class InvalidTemperatureRangeException extends Exception {
    public InvalidTemperatureRangeException(int minTemp, int maxTemp) {
        super("Temperature should be between " + minTemp + " and " + maxTemp + " degrees.");
    }
}
