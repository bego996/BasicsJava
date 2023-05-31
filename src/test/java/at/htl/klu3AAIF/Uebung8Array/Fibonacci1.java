package at.htl.klu3AAIF.Uebung8Array;

public class Fibonacci1 {
    public static void main(String[] args) {
        long a = 0;
        long b = 1;
        long c;
        System.out.printf("(%d/%d) ",0,a);
        System.out.printf("(%d/%d) ",1,b);
        for (int i = 2; i <= 20 ; i++) {
            c = b + a;
            System.out.printf("(%d/%d) ",i,c);
            a = b;
            b = c;
        }
    }
}
