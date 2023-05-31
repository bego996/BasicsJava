package at.htl.klu3AAIF.Wdh1DateAndTime;

public class Beispiel6 {
    public static void main(String[] args) {
        String input = "HTL-Mössingerstraße";
        char zeichen = 'a';
        int zähler = 0;
        while (zähler < input.length()){
            if (zeichen == input.charAt(zähler)){
                System.out.println("(" + (zähler+1) + ")" + zeichen);
                zähler++;
            }else
                zähler++;
        }
        System.out.println(input);
    }
}
