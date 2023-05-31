package at.htl.klu3AAIF.Uebung6Arrays;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int n = 10;
        int[] data = new int[n];
        int[] sum = new int[n-1];
        for (int i = 0; i < data.length ; i++) {
            data[i] = 3*i+10;
        }
        System.out.println(Arrays.toString(data));
        for (int i = 0,j = 1; i < sum.length ; i++,j++) {
                sum[i] = data[i]+data[j];
                System.out.println(Arrays.toString(sum));
            }
        }
    }
