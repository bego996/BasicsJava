package at.htl.klu3AAIF.Uebung3Arrays;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        float[]bodyTemp = new float[24/4];
        float startTemp = 37;
        for (int i = 0; i < bodyTemp.length ; i++) {
            bodyTemp[i] = startTemp;
            startTemp += 0.5F;
        }
        System.out.print(Arrays.toString(bodyTemp));
    }
}
