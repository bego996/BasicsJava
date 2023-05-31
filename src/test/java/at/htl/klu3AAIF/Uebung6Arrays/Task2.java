package at.htl.klu3AAIF.Uebung6Arrays;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int n = 5;
        int [] numbers = new int[n];
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = numbers.length-i;
            System.out.println(Arrays.toString(numbers));
        }
    }
}
