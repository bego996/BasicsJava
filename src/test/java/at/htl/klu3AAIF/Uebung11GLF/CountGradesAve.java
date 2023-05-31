package at.htl.klu3AAIF.Uebung11GLF;

import at.htl.klu3AAIF.Uebung5Arrays.HTLUtilities;

import java.util.Arrays;

public class CountGradesAve {
    public static void main(String[] args) {
        int[] grades = HTLUtilities.getGrades(15);
        int validGrades = 0;
        int gradesOverAve = 0;
        int gradesSum = 0;
        for (int value : grades) {
            if (value > 0) {
                gradesSum += value;
                validGrades++;
            }
        }
        float gradeAve = (float) gradesSum/validGrades;
        for (int value:grades) {
            if (value > gradeAve)
                gradesOverAve++;
        }
        System.out.println("Noten: "+ Arrays.toString(grades));
        System.out.printf("Der Mittelwert ist %.2f.%n%d(gültige) Noten sind echt größer als %.2f.",gradeAve,gradesOverAve,gradeAve);

        }
    }

