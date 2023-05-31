package at.htl.klu3AAIF.Uebung6Arrays;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int n = 5;
        int [] numbers = new int[n];
        int [] numbersCopy = new int[numbers.length];
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = 2*i+1;
        }
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbersCopy.length ; i++) {
            numbersCopy[i] = numbers[i];
            System.out.println(Arrays.toString(numbersCopy));
        }
    }
}
