package at.htl.klu3AAIF.Uebung11GLF;

import at.htl.klu3AAIF.Uebung5Arrays.HTLUtilities;

import java.util.Arrays;

public class CountGradesAveDelta1 {
    public static void main(String[] args) {
        int[] grades = HTLUtilities.getGrades(15);
        int validGrades = 0;
        int gradesCloseToAve = 0;
        int gradesSum = 0;
        for (int value : grades) {
            if (value > 0) {
                gradesSum += value;
                validGrades++;
            }
        }
        float gradeAve = (float) gradesSum/validGrades;
        for (int value:grades) {
            if ((value > gradeAve && value < gradeAve+1) || (value < gradeAve && value > gradeAve-1))
                gradesCloseToAve++;
        }
        System.out.println("Noten: "+ Arrays.toString(grades));
        System.out.printf("Der Mittelwert ist %.2f.%n%d(gültige) Noten sind im Interval [%.2f:%.2f].",gradeAve,gradesCloseToAve,gradeAve-1,gradeAve+1);
    }
}
