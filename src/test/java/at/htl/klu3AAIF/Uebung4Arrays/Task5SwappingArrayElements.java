package at.htl.klu3AAIF.Uebung4Arrays;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Task5SwappingArrayElements {
    public static void main(String[] args) {
        Random rd = new Random();
        int input1;
        int input2;
        Scanner sc = new Scanner(System.in);
        float[] numbers = new float[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rd.nextFloat(200, 300);
        }
        System.out.println(Arrays.toString(numbers));
        while (true) {
            try {
                System.out.println("Type the first position of the Array in you want to swap with another:");
                input1 = sc.nextInt();
                System.out.println("Type the second position in:");
                input2 = sc.nextInt();
                float temp = numbers[input1 - 1];
                numbers[input1 - 1] = numbers[input2 - 1];
                numbers[input2 - 1] = temp;
                System.out.println(Arrays.toString(numbers));
                break;
            } catch (Exception e) {
                if (e instanceof ArrayIndexOutOfBoundsException)
                    System.err.println("Number is out of Arraybound..try it again..");
                else if (e instanceof InputMismatchException ) {
                    System.err.println("Wrong datatype..Try it again");
                    sc.next();
                }
            }
        }
    }
}
