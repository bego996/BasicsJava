package at.htl.klu3AAIF.Uebung5Arrays;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int [] notes = HTLUtilities.getBanknotes(15);
        System.out.println(Arrays.toString(notes));
        for (int i = 0; i < notes.length/2 ; i++) {
            int tmp = notes[i];
            notes[i] = notes[notes.length-1-i];
            notes[notes.length-1-i] = tmp;
        }
        System.out.println(Arrays.toString(notes));
    }
}
