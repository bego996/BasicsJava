package at.htl.klu3AAIF.Uebung3Arrays;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        float[]bodyTemp = new float[6];
        float k = 36.6f;
        for (int i = 0; i < bodyTemp.length ; i++) {
            bodyTemp[i] = k;
        }
        System.out.println(Arrays.toString(bodyTemp));
    }
}
