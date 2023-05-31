package at.htl.klu3AAIF.Uebung5Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        String [] names = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Type 5 Different Names in the input:");
        for (int i = 0; i < names.length ; i++) {
            names[i] = sc.next();
        }
        System.out.println(Arrays.toString(names));
        for (int i = 0; i < names.length-1 ; i++) {
            for (int j = i+1; j < names.length ; j++) {
                if (names[i].compareToIgnoreCase(names[j]) > 0){
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(names));
    }
}



