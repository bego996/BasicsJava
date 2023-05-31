package at.htl.klu3AAIF.Uebung8Array;

import at.htl.klu3AAIF.Uebung5Arrays.HTLUtilities;
import java.util.Arrays;

public class SAM3FeverCurve1 {
    public static void main(String[] args) {
        double[] feverValues = HTLUtilities.getFeverCurve(12);
        System.out.println(Arrays.toString(feverValues));
        feverCurveToSAM(feverValues);
    }
    public static void feverCurveToSAM(double[] array) {   //Methode geht bis zum Ende.
        double sum = 0, amount = 0, min = 41, max = 0;
        double avg;
        for (double value : array) {
            if (value != -1) {
                sum += value;
                amount++;
            if (value < min)
                min = value;
            if (value > max)
                max = value;
            }
        }
        avg = sum / amount;
        System.out.printf("Sum: %.2f Amount: %d Min: %.2f Max: %.2f AVG: %.2f%n", sum, (int)amount, min, max, avg);
    }
}
