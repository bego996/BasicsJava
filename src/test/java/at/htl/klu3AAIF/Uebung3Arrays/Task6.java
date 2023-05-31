package at.htl.klu3AAIF.Uebung3Arrays;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        float[]bodyTemp = new float[(6)];
        float k = 36.6f;
        int i = 0;
        while (i <= bodyTemp.length-1){
            bodyTemp[i] = k;
            i++;
        }
        System.out.println(Arrays.toString(bodyTemp));
    }
}
