package at.htl.klu3AAIF.Wdh1DateAndTime;

public class Beispiel3 {
    public static void main(String[] args) {
        int q = 2;
        int summe = 0;
        int anzahl = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        float mittelwert;
        for (int i = 0; i < 10 + 1; i++) {
            summe += Math.pow(q, i);
            anzahl = i + 1;
            if (summe < min) {
                min = summe;
            }
            if (Math.pow(q, i) > max) {
                max = (int) Math.pow(q, i);
            }
        }
        mittelwert = (float) summe / anzahl;
        System.out.printf("Summe: %d,Anzahl: %d,Min: %d,Max: %d,Mittelwert: %f%n", summe, anzahl, min, max, mittelwert);
    }
}
