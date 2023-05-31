package at.htl.klu3AAIF.Uebung6Arrays;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int n = 12;
        int[] data = new int[n];
        double[] ave = new double[data.length/2];
        for (int i = 0; i < data.length ; i++) {
            data[i] = i*i;
        }
        System.out.println(Arrays.toString(data));
        for (int i = 0; i < ave.length ; i++) {
            ave[i] = (double)(data[i] + data[data.length-1-i]) / 2;
            System.out.println(Arrays.toString(ave));
        }
    }
}
