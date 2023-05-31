package at.htl.klu3AAIF.Uebung3Arrays;

public class Task1 {
    public static void main(String[] args) {
        int [] integer= new int[10];
        float[] bodyTemp= new float[(24/4)];
        float[] year= new float[365];
        int[]  puls= new int[60*8];
        double[]finance= new double[365*24];
        float[] temp= new float[7*24];

        System.out.printf("%d %d %d %d %d %d",integer.length,bodyTemp.length,year.length,puls.length,finance.length,temp.length);
    }
}
