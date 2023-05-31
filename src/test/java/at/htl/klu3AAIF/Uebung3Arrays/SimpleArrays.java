package at.htl.klu3AAIF.Uebung3Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleArrays {

    public static void main(String[] args) {

        {
            // Deklaration, Instanziierung und Initialisierung in einer Zeile
            int[] numbers = {1, 2, 3, 4, 5};

            System.out.println("value 1: " + numbers[0]);
            System.out.println("value 2: " + numbers[1]);
            System.out.println("value 3: " + numbers[2]);
            System.out.println("value 4: " + numbers[3]);
            System.out.println("value 5: " + numbers[4]);

            numbers[0] = 10;
            numbers[1] = 11;
            numbers[2] = 12;
            numbers[3] = 13;
            numbers[4] = 14;

            // Alle Werte eines Arrays mittels einer Schleife auslesen
            for (int i = 0; i < numbers.length; i++) { // mit der length-Info des Arrays arbeiten
                System.out.println(numbers[i]); // von Array-Positionen lesen
            }

            int x = numbers[3];  // den 4. Array-Wert lesen
            System.out.println("Value of the 3. array position:" + x);

            // Neue For-Schleifen-Art: For-Each
            System.out.println("New for each loop");
            for (int nr: numbers) {
                System.out.println(nr);
            }
        }

        System.out.println("Declaration of empty array");
        {
            // Deklaration und Instanziierung eines Arrays mit 5 Elementen - ohne Initialisierung
            int[] numbers = new int[5];

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = i * 2; // auf eine bestimmte Array-Position schreiben
                System.out.println(numbers[i]);
            }
        }

        // Deklaration, Instanziierung und Initialisierung in separaten Schritten
        // 1. Deklaration
        int[] baseValues;
        // 2. Instanziierung
        baseValues = new int[3];
        // 3.Initialisierung
        baseValues[0] = 100;
        baseValues[1] = 200;
        baseValues[2] = 300;

        // String Array
        String[] weekdays = { "Montag" , "Dienstag",
                "Mittwoch", "Donnerstag",
                "Freitag", "Samstag",
                "Sonntag" };

        // double Array mit einer "dynamischen" Länge (nicht zum Kompilier-Zeitpunkt bekannt
        Scanner sc = new Scanner(System.in);
        System.out.print("Wie viele Messwerte müssen verarbeitet werden können: ");
        int nrOfValues = sc.nextInt();
        double[] measuredValues = new double[nrOfValues];

        // Initialisiere das Array mit so vielen Zufallszahlen wie das Array lang ist
        for (int i = 0; i < measuredValues.length; i++) {
            measuredValues[i] = Math.random();
        }

        // Gebe alle Array-Elemente auf zwei Nachkommastellen genau aus
        for (int i = 0; i < measuredValues.length; i++) {
            System.out.printf("%.2f %n", measuredValues[i]);
        }

        // Mache eine Kopie eines Array (deep copy)
        boolean[] valuesOriginal = { true, false, true, false };
        boolean[] valuesCopied = new boolean[valuesOriginal.length];

        // Ein Element nach dem anderen muss (in den neuen Speicherbereich) kopiert werden
        for (int i = 0; i < valuesOriginal.length; i++) {
            valuesCopied[i] = valuesOriginal[i];
        }
        // Einen Wert ändern um zu demonstrieren, dass es sich wirklich um zwei separate Arrays handelt
        valuesCopied[2] = false;

        // die Werte vom originalen und dem kopierten Array ausgeben
        for (int i = 0; i < valuesOriginal.length; i++) {
            System.out.printf("orig[%d]: %b | copy[%d]: %b %n" , i, valuesOriginal[i], i , valuesCopied[i]);
        }

        // eine zweite Variable anlegen, die auch auf das valuesOriginal-Array zeigt (dabei wird keine Kopie angelegt!)
        boolean[] valuesOrig2 = valuesOriginal;
        System.out.println(Arrays.toString(valuesOrig2));

        // Auf eine falsche Position zugreifen -> array out of bound exception
        //boolean bIsValid = valuesOrig2[4];
        //boolean bIsValid = valuesOrig2[-1];

        float[] pulse = new float[60*24];
        pulse[0] = 77;
        //

        // DEBUGGEN ausprobieren!!!!
    }
}
