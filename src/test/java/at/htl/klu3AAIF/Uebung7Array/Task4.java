package at.htl.klu3AAIF.Uebung7Array;

import java.util.Arrays;

public class Task4 {
public static int[] logicalSequence1 (int[] emptyList){
    for (int i = 0; i < emptyList.length ; i++) {
        emptyList[i] = 2 * i +3;
    }
    return emptyList;
}
    public static int[] logicalSequence2 (int[] emptyList){
        for (int i = 0; i < emptyList.length ; i++) {
            final int n0 = 1;
            if (i == 0)
                emptyList[i] = n0;
            else
                emptyList[i] = emptyList[i-1] * 2;
        }
        return emptyList;
    }
    public static int[] logicalSequence3 (int[] emptyList){
        for (int i = 0; i < emptyList.length ; i++) {
            final int n01 = 1;
            if (i == 0 || i == 1)
                emptyList[i] = n01;
            else
                emptyList[i] = emptyList[i-1]+emptyList[i-2];
        }
        return emptyList;
    }
    public static int[] logicalSequence4 (int[] emptyList){
        for (int i = 2; i < emptyList.length ; i++) {
            final int n0 = 10, n1 = 8;
            emptyList[0] = n0;
            emptyList[1] = n1;
            emptyList[i] = emptyList[i-2]-emptyList[i-1];
        }
        return emptyList;
    }
    public static int[] logicalSequence5 (int[] emptyList){
        for (int i = 1; i < emptyList.length ; i++) {
            final int n0 = 1;
            emptyList[0] = n0;
            if (i%2 == 1)
                emptyList[i] = emptyList[i-1]*2-1;
            else
                emptyList[i] = emptyList[i-1]*2+1;
        }
        return emptyList;
    }

    public static void main(String[] args) {
        int[] ListToBeFilled = new int[9];
        System.out.println(Arrays.toString(logicalSequence1(ListToBeFilled)));
        System.out.println(Arrays.toString(logicalSequence2(ListToBeFilled)));
        System.out.println(Arrays.toString(logicalSequence3(ListToBeFilled)));
        System.out.println(Arrays.toString(logicalSequence4(ListToBeFilled)));
        System.out.println(Arrays.toString(logicalSequence5(ListToBeFilled)));
    }
}
