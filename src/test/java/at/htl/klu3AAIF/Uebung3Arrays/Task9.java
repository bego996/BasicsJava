package at.htl.klu3AAIF.Uebung3Arrays;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        String[] weekdays = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.print("Type the Day of the Week, in numbers 1-7 in:");
        int input = new Scanner(System.in).nextInt();
        for (int i = 0; i < weekdays.length ; i++) {
            if (input == i+1) {
                System.out.println(weekdays[i]);
                break;
            }
        }
    }
}
