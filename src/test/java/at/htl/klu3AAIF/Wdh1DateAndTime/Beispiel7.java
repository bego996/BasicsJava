package at.htl.klu3AAIF.Wdh1DateAndTime;

public class Beispiel7 {
    public static void main(String[] args) {

    textCharSearcher("HTL-Mössingerstraße",'e');
    }
    public static void textCharSearcher(String input, char letter) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != letter) {
                continue;
            }else {
                System.out.println("(" + (i + 1) + ")" + letter);
                System.out.println(input);
                break;
            }
        }
    }
}