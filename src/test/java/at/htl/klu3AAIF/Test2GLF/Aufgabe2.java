package at.htl.klu3AAIF.Test2GLF;

import java.util.Arrays;

public class Aufgabe2 {
    public static void main(String[] args) {
        int[] grades = {4,2,0,5,5,0,4,5,2,4,0,2,1,4,5};
        float ave;
        int validGrades = 0;
        int amountGradesUnderAve = 0;
        int sum = 0;
        for (int i = 0; i < grades.length ; i++) {
            sum += grades[i];
            if (grades[i] != 0)
                validGrades++;
        }
        ave = (float) sum/validGrades;
        for (int grade:grades) {
            if (grade < ave && grade !=0)
                amountGradesUnderAve++;
        }
        System.out.println(Arrays.toString(grades));
        System.out.printf("Der Mittelwert ist: %.2f%n%d (gültige) Noten sind echt kleiner als %.2f",ave,amountGradesUnderAve,ave);

    }
}
