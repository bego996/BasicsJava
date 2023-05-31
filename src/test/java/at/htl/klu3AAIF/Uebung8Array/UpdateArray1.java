package at.htl.klu3AAIF.Uebung8Array;

import java.util.Arrays;

public class UpdateArray1 {
    public static void main(String[] args) {
        int[] data = new int[20];
        System.out.println(Arrays.toString(data));
        updateArray(data,10);
        System.out.println(Arrays.toString(data));
    }
    public static void updateArray(int[] inputArray,int count){
        int countFromZero = 0;
        while (countFromZero != count){
          final int randomIndex = new java.util.Random().nextInt(0,inputArray.length);
          inputArray[randomIndex]++;
          countFromZero++;
        }
    }
}
