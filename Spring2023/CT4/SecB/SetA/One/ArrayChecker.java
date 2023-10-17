package Spring2023.CT4.SecB.SetA.One;

public class ArrayChecker {
    public static void CheckArray(int[] array) throws Exception {
        for (int number : array) {
            if (number < 0) {
                throw new Exception("Array contains a negative number: " + number);
            }
        }
    }
}