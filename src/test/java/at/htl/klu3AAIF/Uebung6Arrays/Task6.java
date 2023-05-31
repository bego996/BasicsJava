package at.htl.klu3AAIF.Uebung6Arrays;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int n = 5;
        int [] numbers = new int[n];
        int [] numberscopy = new int[numbers.length];
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = (i+1)*(i+1);
        }
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numberscopy.length ; i++) {
            numberscopy[i] = numbers[i]*2;
            System.out.println(Arrays.toString(numberscopy));
        }
    }
}
