package at.htl.klu3AAIF.Uebung4Arrays;

import java.util.Arrays;

public class Task4PartAndTotalSumArrayCalc {
    public static void main(String[] args) {
        float sumTotal = 0;
        int [] quantities = {1,2,3,4};
        float [] prices = {1.99F,5.50F,9.20F,15.60F};
        float [] subTotals = new float[4];
        for (int i = 0; i < subTotals.length ; i++) {
            sumTotal += quantities[i]*prices[i];
            subTotals[i] = quantities[i]*prices[i];
        }
        System.out.printf("Quantities: %s%n",Arrays.toString(quantities));
        System.out.printf("Prices: %s%n",Arrays.toString(prices));
        System.out.printf("TotalSum: %.2f%n",sumTotal);
        System.out.printf("subTotals: %s",Arrays.toString(subTotals));

    }
}
