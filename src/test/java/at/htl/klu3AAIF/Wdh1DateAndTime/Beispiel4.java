package at.htl.klu3AAIF.Wdh1DateAndTime;

public class Beispiel4 {
    public static void main(String[] args) {
        int maxAndQ = 2;  //q und max kombiniert. *q* ist Die basis vom exponent und verändert sich in der Schleife.*max* ist der Endwert.
        int min = Integer.MAX_VALUE;
        int summe = 0;
        int anzahl = 0;
        float mittelwert;
        for (int i = 0; i < 10 + 1; i++) {
            if (i == 0) {
                summe += 1;
                anzahl += 1;
                min = Math.min(min,summe);
            } else if (i == 1) {
                summe += 2;
                anzahl += 1;
            } else {
                summe += maxAndQ * 2;
                maxAndQ *= 2;
                anzahl += 1;
            }
        }
        mittelwert = (float) summe / anzahl;
        System.out.printf("Summe: %d,Anzahl: %d,Min: %d,Max: %d,Mittelwert: %f%n", summe, anzahl, min, maxAndQ, mittelwert);
    }
}
