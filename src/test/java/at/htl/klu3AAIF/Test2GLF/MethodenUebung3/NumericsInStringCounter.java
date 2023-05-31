package at.htl.klu3AAIF.Test2GLF.MethodenUebung3;

public class NumericsInStringCounter {
    public static void main(String[] args) {
        String wort = "Das sind  17 Zwerge!";
        System.out.printf("%s -> %d",wort,countNumerics(wort));
        System.out.println();
        System.out.printf("%s -> %d",wort,countNumerics2(wort));
    }
    public static int countNumerics(String text){
        int digitCounter = 0;
        char[] textToCharChain = text.toCharArray();
        for (char value:textToCharChain) {
            if (Character.isDigit(value))
                digitCounter++;
        }
        return digitCounter;
    }
    public static int countNumerics2(String text){ //Alternativ Methode zu oben.
        int digitCounter = 0;
        for (int i = 0; i < text.length() ; i++) {
            if (text.charAt(i) <= 58 && text.charAt(i) >= 48)
                digitCounter++;
        }
        return digitCounter;
    }
}
