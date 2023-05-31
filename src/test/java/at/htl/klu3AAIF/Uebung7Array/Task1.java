package at.htl.klu3AAIF.Uebung7Array;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        float sumForAve = 0;
        float[] pricesWithTax = {22.45f,20.99f,27.50f,24.66f,29.99f,26.33f,21.67f};
        float[] pricesNoTax = new float[pricesWithTax.length];
        for (int i = 0; i < pricesWithTax.length; i++) {
            pricesNoTax[i] = (pricesWithTax[i]/120)*100;
            sumForAve += pricesNoTax[i]*0.20;
        }
        System.out.println("Prices without tax: " + Arrays.toString(pricesNoTax));
        System.out.printf("Average Tax: %.2f€%n",sumForAve/pricesNoTax.length);
    }
}
