package at.htl.klu3AAIF.Wdh1DateAndTime;

import java.util.Scanner;

public class Beispiel2 {
    public static void main(String[] args) {
        System.out.print("Gebe den Operator ein > 0 für Programende, 1 für Addition, 2 für Subtraktion, 3 für Multiplikation und 4 für Division:");
        byte operator = new Scanner(System.in).nextByte();
        int ergebnis;
        switch (operator) {
            case 0 -> System.exit(0);
            case 1 -> {
                int zahl1 = new Scanner(System.in).nextInt();
                int zahl2 = new Scanner(System.in).nextInt();
                System.out.println(zahl1 + zahl2);
            }
            case 2 -> {
                int zahl1 = new Scanner(System.in).nextInt();
                int zahl2 = new Scanner(System.in).nextInt();
                System.out.println(zahl1 - zahl2);
            }
            case 3 -> {
                int zahl1 = new Scanner(System.in).nextInt();
                int zahl2 = new Scanner(System.in).nextInt();
                System.out.println(zahl1 * zahl2);
            }
            case 4 -> {
                int zahl1 = new Scanner(System.in).nextInt();
                int zahl2 = new Scanner(System.in).nextInt();
                System.out.println((float) zahl1 / zahl2);
            }
        }

    }
}
