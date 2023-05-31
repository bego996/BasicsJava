package at.htl.klu3AAIF.Uebung3Arrays;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int [] array0 = new int[15];
        int [] array1 = new int[15];
        int [] array2 = new int[15];
        int [] array3 = new int[15];
        int [] array4 = new int[15];
        for (int i = 0; i < array0.length ; i++) {
            array0[i] = 0 * i +3;
            array1[i] = 1 * i;
            array2[i] = 1 * i +10;
            array3[i] = -1 * i -1;
            array4[i] = -1 * i -5;
        }
        System.out.println(Arrays.toString(array0));
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));
    }
}
