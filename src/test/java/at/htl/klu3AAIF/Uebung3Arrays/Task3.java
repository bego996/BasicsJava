package at.htl.klu3AAIF.Uebung3Arrays;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        float[]kp = new float[6];
        float starttemp = 37;
        for (int i = 0; i <= kp.length ; i++) { //Die Schleife läuft über den höchsten Index des Arrays, weil der Array Index immer bei 0 beginnt.(ArrayIndexOutofBoundsException!)
            kp[i] = starttemp;
            starttemp += 0.5F;
        }
        System.out.print(Arrays.toString(kp));
    }
}
