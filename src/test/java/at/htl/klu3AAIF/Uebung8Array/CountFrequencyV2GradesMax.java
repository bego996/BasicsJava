package at.htl.klu3AAIF.Uebung8Array;

import at.htl.klu3AAIF.Uebung5Arrays.HTLUtilities;
import java.util.Arrays;

public class CountFrequencyV2GradesMax {
    public static void main(String[] args) {
        int[] grades = HTLUtilities.getGrades(20,0);
        System.out.println(Arrays.toString(grades));
        int[] frequenz = CountFrequencyV1Points.frequenzPoints(grades); //Methode aus vorherigem Beispiel wird verwendet.
        System.out.println(Arrays.toString(frequenz));
        int maxFromFrequenz = Integer.MIN_VALUE;
        for (int f: frequenz) {
            if (f > maxFromFrequenz)
                maxFromFrequenz = f;
        }
        for (int i = 0; i < frequenz.length ; i++) {
            if (frequenz[i] == maxFromFrequenz){
                System.out.printf("%d(%d) ",i+1,frequenz[i]);
            }
        }
    }
}
