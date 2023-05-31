package at.htl.klu3AAIF.Uebung7Array;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        byte[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int i = numbers.length-1; i > 0 ; i--) {
            numbers[i] = numbers[i-1];
        }
        numbers[0] = 0;
        System.out.println(Arrays.toString(numbers));
    }
}
