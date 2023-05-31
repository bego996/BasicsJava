package at.htl.klu3AAIF.Uebung5Arrays;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] bankNotes = HTLUtilities.getBanknotes(20);
        int[] bankNotesTwice = new int[bankNotes.length * 2];
        System.arraycopy(bankNotes, 0, bankNotesTwice, 0, bankNotes.length);
        for (int i = 0, j = bankNotes.length; i < bankNotes.length ; i++,j++) {
            bankNotesTwice[j] = bankNotes[i];
        }
        System.out.println(Arrays.toString(bankNotes));
        System.out.println(Arrays.toString(bankNotesTwice));
    }
}

