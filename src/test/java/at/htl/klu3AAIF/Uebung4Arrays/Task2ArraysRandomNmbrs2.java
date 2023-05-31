package at.htl.klu3AAIF.Uebung4Arrays;

import java.util.Random;

public class Task2ArraysRandomNmbrs2 {
    public static void main(String[] args) {
        int [] array1 = new int[20];
        Random rd = new Random();
        for (int i = 0; i < array1.length ; i++) {
            array1[i] = rd.nextInt(-50,51);
        }
        StringBuilder forward = new StringBuilder();
        StringBuilder backward = new StringBuilder();
        for (int i = 0, j = array1.length-1; i < array1.length ; i++,j--) {
            forward.append(array1[i]).append(" ");
            backward.append(array1[j]).append(" ");
        }
        System.out.printf("%s%n%s",forward,backward);
    }
}

