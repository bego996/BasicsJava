package at.htl.klu3AAIF.Uebung8Array;

import at.htl.klu3AAIF.Uebung5Arrays.HTLUtilities;

import java.util.Arrays;

public class SAM3Grades1 {
    public static void main(String[] args) {
        int[] grades = HTLUtilities.getGrades(25);
        System.out.println(Arrays.toString(grades));
        gradesToSAM(grades);
    }

    public static void gradesToSAM(int[] array) {   //Methode geht bis zum Ende.
        int sum = 0, amount = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        float avg;
        for (int grade:array) {
            if (grade != 0) {
                sum += grade;
                amount++;
            if (grade < min)
                min = grade;
            if (grade > max)
                max = grade;
            }
        }
        avg = (float) sum / amount;
        System.out.printf("Sum: %d Amount: %d Min: %d Max: %d AVG: %.2f%n", sum, amount, min, max, avg);
    }
}