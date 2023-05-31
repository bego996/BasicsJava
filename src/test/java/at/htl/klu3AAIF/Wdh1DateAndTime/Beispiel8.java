package at.htl.klu3AAIF.Wdh1DateAndTime;

import java.util.Random;

public class Beispiel8 {
    public static void main(String[] args) {
        int random0 = new Random().nextInt(200,301);
        while (random0 % 2 == 0 || random0 % 3 != 0 || random0 % 5 != 0){
            System.out.println(random0 + " -> " + " %2 = " + random0 % 2 + " -> " + " %3 = " + random0 % 3 + " -> " + " %5 = " + random0 % 5);
            random0 = new Random().nextInt(200,301);
        }
    }
}
