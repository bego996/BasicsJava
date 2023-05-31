package at.htl.klu3AAIF.Wdh1DateAndTime;

public class Beispiel1 {
    public static void main(String[] args) {
        byte a = 5;
        short b = 10;
        int c = 20;
        long d = 25;
        float e = 30;
        double f = 35.5;
        String name = "Bego";
        String chain = String.format("%d,%d,%d,%d,%f,%f,%s", a, b, c, d, e, f, name);
        System.out.println(chain);
    }
}
