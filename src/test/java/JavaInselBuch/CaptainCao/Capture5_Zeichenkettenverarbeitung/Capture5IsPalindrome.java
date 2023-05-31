package JavaInselBuch.CaptainCao.Capture5_Zeichenkettenverarbeitung;

public class Capture5IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindromeIgnoringNonLettersAndDigits("Anna hatte rotator im Bauch--"));
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
    public static int isPalindromeIgnoringNonLettersAndDigits(String str){
        int counter = 0;
        String sb = "";
        String[] cuttedText = str.trim().split("[ +]");
        for (int i = 0; i < cuttedText.length ; i++) {
            for (int j = 0; j < cuttedText[i].length() ; j++) {
                if (cuttedText[i].length() > 1){
                    if (Character.isLetterOrDigit(cuttedText[i].charAt(j)))
                        sb += cuttedText[i].charAt(j);
                }
            }
            counter += isPalindrome(sb) ? 1 : 0;
            sb = "";
        }
        return counter;
        }
    }


