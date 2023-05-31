package at.htl.klu3AAIF.Uebung4Arrays;
import static java.lang.System.out;

import java.util.Arrays;
import java.util.Random;

public class Task3CalculateWthArrays {
    public static void main(String[] args) {
        Random rd = new Random();
        StringBuilder StraightIndexValues = new StringBuilder();
        int sum = 0;
        int amountTotal = 0,amountStraightNmb = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        float middle;
        int [] array1 = new int[50];
        for (int i = 0; i < array1.length ; i++) {
            array1[i] = rd.nextInt(101);
            sum += array1[i];
            amountTotal++;
            min = Math.min(array1[i], min);
            max = Math.max(array1[i],max);
            amountStraightNmb += array1[i]%2 == 0 ? 1 : 0;
            if (i %2 == 0)
                StraightIndexValues.append(array1[i]).append(" ");
        }
        middle =(float)sum/amountTotal;
        out.println(Arrays.toString(array1));
        out.printf("Sum=%d,Amount=%d,Min=%d,Max=%d,MiddleValue=%.2f%n",sum,amountTotal,min,max,middle);
        out.printf("Total Amount of Straight Array Values: %d%nStraight index Values: %s",amountStraightNmb,StraightIndexValues);
    }
}
