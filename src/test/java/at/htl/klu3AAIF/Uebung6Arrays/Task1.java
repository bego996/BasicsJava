package at.htl.klu3AAIF.Uebung6Arrays;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int n = 5;
        int [] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+1;
            System.out.println(Arrays.toString(numbers));
        }
    }
}
