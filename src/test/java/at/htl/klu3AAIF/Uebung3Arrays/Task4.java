package at.htl.klu3AAIF.Uebung3Arrays;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        float[]bodyTemp = new float[6];
        float k = 36.6f;
        int i = 0;
        bodyTemp[i++] = k;
        bodyTemp[i++] = k;
        bodyTemp[i++] = k;
        bodyTemp[i++] = k;
        bodyTemp[i++] = k;
        bodyTemp[i] = k;
        System.out.println(Arrays.toString(bodyTemp));

    }
}
