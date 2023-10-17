package Spring2023.CT4.SecA.SetB.One;

public class StringUtil {
    public static void CheckString(String input) throws Exception {
        String[] words = input.split("\\s+"); // Split the input string into words

        for (String word : words) {
            if (word.length() < 4) {
                throw new Exception("String contains a word less than 4 characters long: " + word);
            }
        }
    }
}