package at.htl.klu3AAIF.MethodenUebung1;

import java.util.Arrays;

public class SimpleMathV1 {
    public static void main(String[] args) {
        System.out.println(sum(5,10));
        System.out.println(sum((long) 5,15));
        System.out.println(sum(5.5,55.5));
        System.out.println(getRandom());
        int[] neuesArra = getArray(20,10,20);
        System.out.println(Arrays.toString(neuesArra));
    }

    /**
     *Gibt die Summe zweier Ganzzahlen aus.
     * @param a die erste Ganzzahl.
     * @param b die zweite Ganzzahl.
     * @return der summierte Betrag wird zurückgegeben.
     */
    public static int sum(int a,int b){return a+b;}
    /**
     * Gibt die Summe zweier Long Ganzzahlen aus.
     *@param a die erste Ganzzahl.
     *@param b die zweite Ganzzahl.
     *@return der summierte Betrag wird zurückgegeben.
     */
    public static long sum(long a,long b){return a+b;}
    /**
     * Gibt die Summe zweier Fließkommazahlen aus.
     * @param a die erste Fließkommazahl.
     * @param b die zweite Fließkommazahl.
     * @return die summierte Fließkommazahl wird ausgegeben.
     */
    public static double sum(double a,double b){return a+b;}

    /**
     * Gibt eine Zufallszahl zwischen 0 und 100 aus.
     * @return generiert eine Zufallszahl.
     */

    public static int getRandom(){
        return new java.util.Random().nextInt(101);
    }
    /**
     * Gibt eine Array zurück ,dessen Elemente per Zuffalsgenerator sowie die Länge(fix) bestimmt werden können.
     * @param length die gewünschte Länge.
     * @param min der gewünschte Anfangswert der Elemente.
     * @param max der gewünschte Maximalwert der Elemente.
     * @return das int Array.
     */
    public static int[] getArray(int length,int min,int max){
        int[] arrayToBeFilled = new int[length];
        for (int i = 0; i < length; i++) {
            arrayToBeFilled[i] = new java.util.Random().nextInt(min,max+1);
        }
        return arrayToBeFilled;
    }


}
