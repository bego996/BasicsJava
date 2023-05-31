package at.htl.klu3AAIF.Uebung8Array;

import at.htl.klu3AAIF.Uebung5Arrays.HTLUtilities;

import java.util.Arrays;

public class SumOfArrays {
    public static void main(String[] args) {
        int[] data = HTLUtilities.getRandomArray(10,20,10,49);
        int[] data2 = HTLUtilities.getRandomArray(data.length,10,49);
        int[] data3 = new int[data.length];
        sumOfInputArrays(data,data2,data3);
        System.out.println(Arrays.toString(data)+"\n"+"len1: "+data.length);
        System.out.println(Arrays.toString(data2)+"\n"+"len2: "+data2.length);
        System.out.println(Arrays.toString(data3)+"\n"+"len3: "+data3.length);
    }
    public static void sumOfInputArrays(int[] arrayInput1,int[] arrayInput2,int[] arrayToBeFilled){
        for (int i = 0; i < arrayToBeFilled.length; i++) {
            arrayToBeFilled[i] = arrayInput1[i]+arrayInput2[i];
        }
    }
}
