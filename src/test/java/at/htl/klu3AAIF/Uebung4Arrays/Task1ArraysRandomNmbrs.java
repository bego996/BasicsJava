package at.htl.klu3AAIF.Uebung4Arrays;

import java.util.Arrays;
import java.util.Random;

import static java.lang.System.out;

public class Task1ArraysRandomNmbrs {
    public static void main(String[] args) {
        int [] array1 = new int[15];
        Random rd = new Random();
        for (int i = 0;i < array1.length;i++){
            array1[i] = rd.nextInt(10,101);
        }
        out.println(Arrays.toString(array1));
    }
}
