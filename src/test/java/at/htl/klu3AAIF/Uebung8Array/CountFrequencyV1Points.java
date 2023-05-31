package at.htl.klu3AAIF.Uebung8Array;

import at.htl.klu3AAIF.Uebung5Arrays.HTLUtilities;


import java.util.Arrays;

public class CountFrequencyV1Points {
    public static void main(String[] args) {
        int[] points = HTLUtilities.getPoints(20);
        System.out.println(Arrays.toString(points));
        int[] freq = frequenzPoints(points);
        System.out.println(Arrays.toString(freq));
    }
    public static int[] frequenzPoints (int[] pointArray){  //Methode geht bis zum Ende.
        int pointsMin = Integer.MAX_VALUE;
        int pointsMax = Integer.MIN_VALUE;
        for (int point : pointArray) {  //Ermitteln des Min und Max Wertes der Punkte.
            pointsMin = Math.min(point,pointsMin);
           pointsMax = Math.max(point,pointsMax);
        }
        int [] freq = new int[pointsMax-pointsMin+1];   //Automatisiertes ermitteln der Länge des frequenz Arrays.
        for (int i = pointsMin,j = 0; j < freq.length; i++,j++) { //Variable j wird zum iterrieren über das Frequenz Array genutzt.
            for (int value : pointArray) {  //Auslesen vom Hauptarray, dass mit zufallspunkten befüllt ist.
                if (value == i) {
                    freq[j]++;
                }
            }
        }
        System.out.printf("Min: %d, Max: %d%n",pointsMin,pointsMax);    //Ausgabe zum Überprüfen von min und maximal Wert.
        return freq;             //Befülltes frequenz array wird zurückgegeben um damit weiterarbeiten zu können.
    }
}
