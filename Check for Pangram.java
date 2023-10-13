public class PangramChecker {
    public static boolean isPangram(String str) {
        str = str.toLowerCase();
        boolean[] isAlphabetPresent = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isAlphabetic(ch)) {
                isAlphabetPresent[ch - 'a'] = true;
            }
        }
        for (boolean isPresent : isAlphabetPresent) {
            if (!isPresent) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String sentence = "Pack my box with five dozen liquor jugs";
        boolean isPangram = isPangram(sentence);
        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }
}
