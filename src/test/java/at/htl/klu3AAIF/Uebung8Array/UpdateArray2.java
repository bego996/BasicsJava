package at.htl.klu3AAIF.Uebung8Array;

import java.util.Arrays;

public class UpdateArray2 {
    public static void main(String[] args) {
        int [] data = new int[20];
        System.out.println(Arrays.toString(data));
        updateArray(data,25);
    }

    public static void updateArray(int[] inputArray,int count){
        int countFromZero = 0;
        int trials = 0;
        while (countFromZero != count){
        final int randomIndex = new java.util.Random().nextInt(0,inputArray.length);
            if (inputArray[randomIndex] != 1){
                inputArray[randomIndex]++;
                countFromZero++;
            }
            trials++;
        }
        System.out.println(Arrays.toString(inputArray));
        System.out.println("Trials " + trials);
    }
}

