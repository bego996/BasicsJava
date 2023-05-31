package at.htl.klu3AAIF.Uebung6Arrays;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int n = 5;
        int[] data = new int[n];
        int[] rev = new int[data.length];
        for (int i = 0; i < data.length ; i++) {
            data[i] = 2*i+2;
        }
        System.out.println(Arrays.toString(data));
        for (int i = rev.length-1,j = 0; i >= 0 ; i--,j++) {
            rev[j] = data[i];
            System.out.println(Arrays.toString(rev));
        }
    }
}
