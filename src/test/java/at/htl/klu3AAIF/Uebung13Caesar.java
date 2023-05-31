package at.htl.klu3AAIF;

public class Uebung13Caesar {
    public static void main(String[] args) {
        String input = "Caesar kam,sah,siegte!";
        String encrypted = inputEncrypted(input,1);
        System.out.println(encrypted);
        inputDecrypted(encrypted,10,0);

    }
    public static String inputEncrypted(String blank,int step){
        String encrypted = "";
        for (int i = 0; i < blank.length() ; i++) {
            if (step > 0)
                encrypted += (char)(blank.charAt(i) % 255 + step);
            else {
                encrypted += (char) (blank.charAt(i) % 255 + step + 1);
            }
        }
        return encrypted;
    }
    public static void inputDecrypted(String blank,int MinusStep,int len){
        String decrypted = "";
        if (MinusStep <= len)
            return;
        for (int i = 0; i < blank.length() ; i++) {
            decrypted += (char)(blank.charAt(i) % 256 - MinusStep);
        }
        System.out.println(decrypted);
        MinusStep--;
        inputDecrypted(blank,MinusStep,len);
        for (int i = 0; i < blank.length() ; i++) {
            System.out.print((char)(blank.charAt(i) % 256 + MinusStep));
        }
        System.out.println();
    }
}
