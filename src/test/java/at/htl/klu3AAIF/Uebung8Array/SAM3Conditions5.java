package at.htl.klu3AAIF.Uebung8Array;

import java.util.Arrays;
import java.util.Random;

public class SAM3Conditions5 {
    public static void main(String[] args) {
        int[] randomNmbrs = new  int[40];
        arrayToSAM(randomNmbrs);

    }
    public static void arrayToSAM (int[] array) {   //Methode geht bis zum Ende.
        int sum = 0, amount = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        float avg;
        for (int i = 0; i < array.length; i++) {
            int rg = new Random().nextInt(50, 101);
            array[i] = rg;
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2 != 0 && array[i] % 3 != 0) || (i > 0 && array[i]%i == 0)) {
                System.out.printf("(%d)%d ",i,array[i]);
                sum += array[i];
                amount++;
                if (array[i] < min)
                    min = array[i];
                if (array[i] > max)
                    max = array[i];
            }
        }
        avg = (float) sum / amount;
        System.out.println();
        System.out.printf("Sum: %d Amount: %d Min: %d Max: %d AVG: %.2f%n", sum, amount, min, max, avg);
    }
}
