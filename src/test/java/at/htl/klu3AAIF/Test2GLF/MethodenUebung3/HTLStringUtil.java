package at.htl.klu3AAIF.Test2GLF.MethodenUebung3;

public class HTLStringUtil {

    public static int getOccurrences(String word, String letter) {
        int letterCounter = 0;
        if (word != null && !word.isEmpty()) {
            int acsiiChar = letter.toUpperCase().charAt(0);
            for (int i = 0; i < word.length(); i++) {
                int asciiValue = word.toUpperCase().charAt(i);
                letterCounter += acsiiChar == asciiValue ? 1 : 0;
            }
        }
            return letterCounter;
    }

    public static boolean isPalindrome(String input){
        boolean TruePalindrome = false;
        if (input != null && !input.isEmpty()) {
            StringBuilder PrepareReverse = new StringBuilder();
            for (int i = input.length() - 1; i >= 0; i--) {
                PrepareReverse.append(input.charAt(i));
            }
            TruePalindrome = input.equalsIgnoreCase(PrepareReverse.toString());
        }
        return TruePalindrome;
    }
    public static boolean isQuestion(String sencence){
        if (sencence == null || sencence.isEmpty()) {
            return false;
        }
        return sencence.charAt(sencence.length() - 1) == '?';
    }
    public static boolean isRequest(String sencence){
        if (sencence == null || sencence.isEmpty()) {
            return false;
        }
        return sencence.charAt(sencence.length() - 1) == '!';
    }
    public static boolean isStatement(String sencence){
        if (sencence == null || sencence.isEmpty()) {
            return false;
        }
        return sencence.charAt(sencence.length() - 1) == '.';
    }
    public static int getNumberOfSencences(String text){
        int sencenceCounter = 0;
        for (int i = 0; i < text.length() ; i++) {
            sencenceCounter += text.charAt(i) == '.' ? 1 : //Der selbe Trinäeroperator die nächsten 3 Zeilen.
                               text.charAt(i) == '!' ? 1 :
                               text.charAt(i) == '?' ? 1 : 0;
        }
        return sencenceCounter;
    }
}
