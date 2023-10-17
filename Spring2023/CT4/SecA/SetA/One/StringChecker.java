package Spring2023.CT4.SecA.SetA.One;

public class StringChecker {
    public static void CheckString(String input) throws Exception {
        String[] words = input.split("\\s+");
        
        for (String word : words) {
            if (word.startsWith("ab")) {
                throw new Exception("String contains a word starting with 'ab': " + word);
            }
        }
    }
}