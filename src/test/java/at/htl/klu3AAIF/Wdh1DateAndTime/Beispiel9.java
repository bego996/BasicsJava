package at.htl.klu3AAIF.Wdh1DateAndTime;

import java.util.Random;

public class Beispiel9 {
    public static void main(String[] args) {
        int random0 = new Random().nextInt(100,201);
        while ( !(random0 % 3 == 0) && !(random0 % 5 != 0 && random0 % 7 != 0)){
            System.out.println(random0 + " -> " + " %3 = " + random0 % 3 + " -> " + " %5 = " + random0 % 5 + " -> " + " %7 = " + random0 % 7);
            random0 = new Random().nextInt(100, 201);
        }
    }
}
