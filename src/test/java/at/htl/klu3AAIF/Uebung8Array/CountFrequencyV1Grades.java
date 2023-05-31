package at.htl.klu3AAIF.Uebung8Array;

import at.htl.klu3AAIF.Uebung5Arrays.HTLUtilities;

import java.util.Arrays;

public class CountFrequencyV1Grades {
    public static void main(String[] args) {
        int [] grades = HTLUtilities.getGrades(20,0);
        int [] freq = new int[5];
        for (int grade : grades) {
            switch (grade) {
                case 1 -> freq[0]++;
                case 2 -> freq[1]++;
                case 3 -> freq[2]++;
                case 4 -> freq[3]++;
                case 5 -> freq[4]++;
            }
        }
        System.out.println("grades: " + Arrays.toString(grades));
        System.out.println("freq: " + Arrays.toString(freq));
        System.out.printf("(num/freq): (1/%d), (2/%d), (3/%d), (4/%d), (5/%d)",freq[0],freq[1],freq[2],freq[3],freq[4]);
    }
}
