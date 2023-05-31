package at.htl.klu3AAIF.Test2GLF;

import java.util.Arrays;

public class aufgabe5 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getRandomValues(10,15,20)));
    }
    public static int[] getRandomValues(int length,int min,int max){
        int array1[] = new int[length];
        for (int i = 0; i < array1.length ; i++) {
            array1[i] = new java.util.Random().nextInt(min,max+1);
        }
        return array1;
    }
}
