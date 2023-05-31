package at.htl.klu3AAIF.Uebung5Arrays;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
    int [] counter = new int[6];
        for (int i = 1; i <= 1000 ; i++) {
            int cube = HTLUtilities.getRandom(1,6);
            switch (cube) {
                case 1 -> counter[0]++;
                case 2 -> counter[1]++;
                case 3 -> counter[2]++;
                case 4 -> counter[3]++;
                case 5 -> counter[4]++;
                case 6 -> counter[5]++;
            }
        }
        int max = Integer.MIN_VALUE;
        int number = 0;
        for (int i = 0; i < counter.length ; i++) {
            if (counter[i] > max) {
                max = counter[i];
                number = i+1;
            }
        }
        System.out.println(Arrays.toString(counter));
        System.out.println("The highest Throw was "+ number + " with a total amount of " + max);
    }
}
