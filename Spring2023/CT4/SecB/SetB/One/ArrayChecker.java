package Spring2023.CT4.SecB.SetB.One;

public class ArrayChecker {
    public static void CheckArray(int[] array) throws Exception {
        for (int num : array) {
            if (num % 2 != 0) {
                throw new Exception("Array contains an odd number: " + num);
            }
        }
    }
}