package JavaInselBuch.CaptainCao.Capture5_Zeichenkettenverarbeitung;

public class Capture5SavePassword {
    public static void main(String[] args) {
        System.out.println(isPassSave("Begohuuhuhhuhuh/ 8"));
    }
    public static boolean isPassSave(String password) {
        int minLength = 10;
        if (password != null && password.length() >= minLength) {
            int[] needed = new int[5]; //5 Sonder,Number,upper,lower,space
            char[] chainTotest = password.toCharArray();
            for (char c : chainTotest) {
                if (isdigit(c) && needed[0] == 0)
                    needed[0]++;
                else if (isUpper(c) && needed[1] == 0)
                    needed[1]++;
                else if (isLower(c) && needed[2] == 0)
                    needed[2]++;
                else if (isSpace(c) && needed[3] == 0)
                    needed[3]++;
                else if (isSonder(c) && needed[4] == 0)
                    needed[4]++;
            }
            return needed[0] == 1 && needed[1] == 1 && needed[2] == 1 && needed[3] == 1 && needed[4] == 1;
        }
        return false;
    }






    public static boolean isdigit(char c){return c >= 48 && c <= 57;}

    public static boolean isUpper(char c){return c >= 65 && c <= 90;}

    public static boolean isLower(char c){return c >= 97 && c <= 122;}

    public static boolean isSpace(char c){return Character.isWhitespace(c);}

    public static boolean isSonder(char c){return c >= 33 && c <= 47 || c >= 58 && c <= 64 || c >= 91 && c <= 96 || c >= 123 && c <= 126;}

}
