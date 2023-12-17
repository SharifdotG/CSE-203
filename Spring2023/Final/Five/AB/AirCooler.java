package Spring2023.Final.Five.AB;

public class AirCooler {
    public static void runAirCooler(int temp) throws InvalidTemperatureRangeException {
        int minTemp = 10;
        int maxTemp = 28;

        if (temp >= minTemp && temp <= maxTemp) {
            System.out.println("Running at " + temp + " degrees.");
        } else {
            throw new InvalidTemperatureRangeException(minTemp, maxTemp);
        }
    }
}
