package at.htl.klu3AAIF.Test2GLF;

import java.util.Arrays;

public class Aufgabe1 {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        for (int i = 0; i <10  ; i++) {
            numbers[new java.util.Random().nextInt(0,20)] += 5;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
